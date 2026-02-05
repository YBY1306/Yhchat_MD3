package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00e5\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010'J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010'J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010'J\u0010\u0010?\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010'J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ec\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020GH\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b+\u0010'R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b,\u0010'R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b-\u0010'R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a\u00a8\u0006I"}, m169d2 = {"Lcom/yhchat/canarys/data/model/SendMessageContent;", "", "text", "", "buttons", "fileName", "file", "mentionedId", "", "form", "quoteMsgText", "image", "msgText1", "msgText2", "expressionId", "fileSize", "", "video", "audio", "audioTime", "stickerItemId", "stickerPackId", "roomName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getButtons", "getFileName", "getFile", "getMentionedId", "()Ljava/util/List;", "getForm", "getQuoteMsgText", "getImage", "getMsgText1", "getMsgText2", "getExpressionId", "getFileSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVideo", "getAudio", "getAudioTime", "getStickerItemId", "getStickerPackId", "getRoomName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/SendMessageContent;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SendMessageContent {
    public static final int $stable = 8;

    @SerializedName("audio")
    private final String audio;

    @SerializedName("audio_time")
    private final Long audioTime;

    @SerializedName("buttons")
    private final String buttons;

    @SerializedName("expression_id")
    private final String expressionId;

    @SerializedName("file")
    private final String file;

    @SerializedName("file_name")
    private final String fileName;

    @SerializedName("file_size")
    private final Long fileSize;

    @SerializedName("form")
    private final String form;

    @SerializedName("image")
    private final String image;

    @SerializedName("mentioned_id")
    private final List<String> mentionedId;

    @SerializedName("msg_text1")
    private final String msgText1;

    @SerializedName("msg_text2")
    private final String msgText2;

    @SerializedName("quote_msg_text")
    private final String quoteMsgText;

    @SerializedName("room_name")
    private final String roomName;

    @SerializedName("sticker_item_id")
    private final Long stickerItemId;

    @SerializedName("sticker_pack_id")
    private final Long stickerPackId;

    @SerializedName("text")
    private final String text;

    @SerializedName("video")
    private final String video;

    public SendMessageContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ SendMessageContent copy$default(SendMessageContent sendMessageContent, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Long l2, Long l3, Long l4, String str13, int i, Object obj) {
        String str14;
        Long l5;
        String str15 = (i & 1) != 0 ? sendMessageContent.text : str;
        String str16 = (i & 2) != 0 ? sendMessageContent.buttons : str2;
        String str17 = (i & 4) != 0 ? sendMessageContent.fileName : str3;
        String str18 = (i & 8) != 0 ? sendMessageContent.file : str4;
        List list2 = (i & 16) != 0 ? sendMessageContent.mentionedId : list;
        String str19 = (i & 32) != 0 ? sendMessageContent.form : str5;
        String str20 = (i & 64) != 0 ? sendMessageContent.quoteMsgText : str6;
        String str21 = (i & 128) != 0 ? sendMessageContent.image : str7;
        String str22 = (i & 256) != 0 ? sendMessageContent.msgText1 : str8;
        String str23 = (i & 512) != 0 ? sendMessageContent.msgText2 : str9;
        String str24 = (i & 1024) != 0 ? sendMessageContent.expressionId : str10;
        Long l6 = (i & 2048) != 0 ? sendMessageContent.fileSize : l;
        String str25 = (i & 4096) != 0 ? sendMessageContent.video : str11;
        String str26 = (i & 8192) != 0 ? sendMessageContent.audio : str12;
        String str27 = str15;
        Long l7 = (i & 16384) != 0 ? sendMessageContent.audioTime : l2;
        Long l8 = (i & 32768) != 0 ? sendMessageContent.stickerItemId : l3;
        Long l9 = (i & 65536) != 0 ? sendMessageContent.stickerPackId : l4;
        if ((i & 131072) != 0) {
            l5 = l9;
            str14 = sendMessageContent.roomName;
        } else {
            str14 = str13;
            l5 = l9;
        }
        return sendMessageContent.copy(str27, str16, str17, str18, list2, str19, str20, str21, str22, str23, str24, l6, str25, str26, l7, l8, l5, str14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMsgText2() {
        return this.msgText2;
    }

    /* renamed from: component11, reason: from getter */
    public final String getExpressionId() {
        return this.expressionId;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component13, reason: from getter */
    public final String getVideo() {
        return this.video;
    }

    /* renamed from: component14, reason: from getter */
    public final String getAudio() {
        return this.audio;
    }

    /* renamed from: component15, reason: from getter */
    public final Long getAudioTime() {
        return this.audioTime;
    }

    /* renamed from: component16, reason: from getter */
    public final Long getStickerItemId() {
        return this.stickerItemId;
    }

    /* renamed from: component17, reason: from getter */
    public final Long getStickerPackId() {
        return this.stickerPackId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtons() {
        return this.buttons;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    public final List<String> component5() {
        return this.mentionedId;
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
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMsgText1() {
        return this.msgText1;
    }

    public final SendMessageContent copy(String text, String buttons, String fileName, String file, List<String> mentionedId, String form, String quoteMsgText, String image, String msgText1, String msgText2, String expressionId, Long fileSize, String video, String audio, Long audioTime, Long stickerItemId, Long stickerPackId, String roomName) {
        return new SendMessageContent(text, buttons, fileName, file, mentionedId, form, quoteMsgText, image, msgText1, msgText2, expressionId, fileSize, video, audio, audioTime, stickerItemId, stickerPackId, roomName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageContent)) {
            return false;
        }
        SendMessageContent sendMessageContent = (SendMessageContent) other;
        return Intrinsics.areEqual(this.text, sendMessageContent.text) && Intrinsics.areEqual(this.buttons, sendMessageContent.buttons) && Intrinsics.areEqual(this.fileName, sendMessageContent.fileName) && Intrinsics.areEqual(this.file, sendMessageContent.file) && Intrinsics.areEqual(this.mentionedId, sendMessageContent.mentionedId) && Intrinsics.areEqual(this.form, sendMessageContent.form) && Intrinsics.areEqual(this.quoteMsgText, sendMessageContent.quoteMsgText) && Intrinsics.areEqual(this.image, sendMessageContent.image) && Intrinsics.areEqual(this.msgText1, sendMessageContent.msgText1) && Intrinsics.areEqual(this.msgText2, sendMessageContent.msgText2) && Intrinsics.areEqual(this.expressionId, sendMessageContent.expressionId) && Intrinsics.areEqual(this.fileSize, sendMessageContent.fileSize) && Intrinsics.areEqual(this.video, sendMessageContent.video) && Intrinsics.areEqual(this.audio, sendMessageContent.audio) && Intrinsics.areEqual(this.audioTime, sendMessageContent.audioTime) && Intrinsics.areEqual(this.stickerItemId, sendMessageContent.stickerItemId) && Intrinsics.areEqual(this.stickerPackId, sendMessageContent.stickerPackId) && Intrinsics.areEqual(this.roomName, sendMessageContent.roomName);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((this.text == null ? 0 : this.text.hashCode()) * 31) + (this.buttons == null ? 0 : this.buttons.hashCode())) * 31) + (this.fileName == null ? 0 : this.fileName.hashCode())) * 31) + (this.file == null ? 0 : this.file.hashCode())) * 31) + (this.mentionedId == null ? 0 : this.mentionedId.hashCode())) * 31) + (this.form == null ? 0 : this.form.hashCode())) * 31) + (this.quoteMsgText == null ? 0 : this.quoteMsgText.hashCode())) * 31) + (this.image == null ? 0 : this.image.hashCode())) * 31) + (this.msgText1 == null ? 0 : this.msgText1.hashCode())) * 31) + (this.msgText2 == null ? 0 : this.msgText2.hashCode())) * 31) + (this.expressionId == null ? 0 : this.expressionId.hashCode())) * 31) + (this.fileSize == null ? 0 : this.fileSize.hashCode())) * 31) + (this.video == null ? 0 : this.video.hashCode())) * 31) + (this.audio == null ? 0 : this.audio.hashCode())) * 31) + (this.audioTime == null ? 0 : this.audioTime.hashCode())) * 31) + (this.stickerItemId == null ? 0 : this.stickerItemId.hashCode())) * 31) + (this.stickerPackId == null ? 0 : this.stickerPackId.hashCode())) * 31) + (this.roomName != null ? this.roomName.hashCode() : 0);
    }

    public String toString() {
        return "SendMessageContent(text=" + this.text + ", buttons=" + this.buttons + ", fileName=" + this.fileName + ", file=" + this.file + ", mentionedId=" + this.mentionedId + ", form=" + this.form + ", quoteMsgText=" + this.quoteMsgText + ", image=" + this.image + ", msgText1=" + this.msgText1 + ", msgText2=" + this.msgText2 + ", expressionId=" + this.expressionId + ", fileSize=" + this.fileSize + ", video=" + this.video + ", audio=" + this.audio + ", audioTime=" + this.audioTime + ", stickerItemId=" + this.stickerItemId + ", stickerPackId=" + this.stickerPackId + ", roomName=" + this.roomName + ")";
    }

    public SendMessageContent(String text, String buttons, String fileName, String file, List<String> list, String form, String quoteMsgText, String image, String msgText1, String msgText2, String expressionId, Long fileSize, String video, String audio, Long audioTime, Long stickerItemId, Long stickerPackId, String roomName) {
        this.text = text;
        this.buttons = buttons;
        this.fileName = fileName;
        this.file = file;
        this.mentionedId = list;
        this.form = form;
        this.quoteMsgText = quoteMsgText;
        this.image = image;
        this.msgText1 = msgText1;
        this.msgText2 = msgText2;
        this.expressionId = expressionId;
        this.fileSize = fileSize;
        this.video = video;
        this.audio = audio;
        this.audioTime = audioTime;
        this.stickerItemId = stickerItemId;
        this.stickerPackId = stickerPackId;
        this.roomName = roomName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SendMessageContent(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Long l2, Long l3, Long l4, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str14 = (i & 1) != 0 ? null : str;
        String str15 = (i & 2) != 0 ? null : str2;
        String str16 = (i & 4) != 0 ? null : str3;
        String str17 = (i & 8) != 0 ? null : str4;
        List list2 = (i & 16) != 0 ? null : list;
        String str18 = (i & 32) != 0 ? null : str5;
        String str19 = (i & 64) != 0 ? null : str6;
        String str20 = (i & 128) != 0 ? null : str7;
        String str21 = (i & 256) != 0 ? null : str8;
        String str22 = (i & 512) != 0 ? null : str9;
        String str23 = (i & 1024) != 0 ? null : str10;
        Long l5 = (i & 2048) != 0 ? null : l;
        String str24 = (i & 4096) != 0 ? null : str11;
        String str25 = (i & 8192) != 0 ? null : str12;
        Long l6 = (i & 16384) != 0 ? null : l2;
        this(str14, str15, str16, str17, list2, str18, str19, str20, str21, str22, str23, l5, str24, str25, l6, (i & 32768) != 0 ? null : l3, (i & 65536) != 0 ? null : l4, (i & 131072) != 0 ? null : str13);
    }

    public final String getText() {
        return this.text;
    }

    public final String getButtons() {
        return this.buttons;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFile() {
        return this.file;
    }

    public final List<String> getMentionedId() {
        return this.mentionedId;
    }

    public final String getForm() {
        return this.form;
    }

    public final String getQuoteMsgText() {
        return this.quoteMsgText;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getMsgText1() {
        return this.msgText1;
    }

    public final String getMsgText2() {
        return this.msgText2;
    }

    public final String getExpressionId() {
        return this.expressionId;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final String getVideo() {
        return this.video;
    }

    public final String getAudio() {
        return this.audio;
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

    public final String getRoomName() {
        return this.roomName;
    }
}
