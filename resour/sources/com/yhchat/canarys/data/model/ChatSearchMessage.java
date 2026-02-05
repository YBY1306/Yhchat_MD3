package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ChatSearchModels.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003Jo\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\bH\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/data/model/ChatSearchMessage;", "", Name.MARK, "", "sequence", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "content", "type", "time", "timeText", "<init>", "(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSequence", "()J", "getChatId", "getChatType", "()I", "getName", "getAvatarUrl", "getContent", "getType", "getTime", "getTimeText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ChatSearchMessage {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("content")
    private final String content;

    @SerializedName(Name.MARK)
    private final String id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("sequence")
    private final long sequence;

    @SerializedName("time")
    private final long time;

    @SerializedName("timeText")
    private final String timeText;

    @SerializedName("type")
    private final String type;

    public static /* synthetic */ ChatSearchMessage copy$default(ChatSearchMessage chatSearchMessage, String str, long j, String str2, int i, String str3, String str4, String str5, String str6, long j2, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatSearchMessage.id;
        }
        if ((i2 & 2) != 0) {
            j = chatSearchMessage.sequence;
        }
        if ((i2 & 4) != 0) {
            str2 = chatSearchMessage.chatId;
        }
        if ((i2 & 8) != 0) {
            i = chatSearchMessage.chatType;
        }
        if ((i2 & 16) != 0) {
            str3 = chatSearchMessage.name;
        }
        if ((i2 & 32) != 0) {
            str4 = chatSearchMessage.avatarUrl;
        }
        if ((i2 & 64) != 0) {
            str5 = chatSearchMessage.content;
        }
        if ((i2 & 128) != 0) {
            str6 = chatSearchMessage.type;
        }
        if ((i2 & 256) != 0) {
            j2 = chatSearchMessage.time;
        }
        if ((i2 & 512) != 0) {
            str7 = chatSearchMessage.timeText;
        }
        String str8 = str7;
        long j3 = j2;
        String str9 = str5;
        String str10 = str6;
        return chatSearchMessage.copy(str, j, str2, i, str3, str4, str9, str10, j3, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTimeText() {
        return this.timeText;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSequence() {
        return this.sequence;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final ChatSearchMessage copy(String id, long sequence, String chatId, int chatType, String name, String avatarUrl, String content, String type, long time, String timeText) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeText, "timeText");
        return new ChatSearchMessage(id, sequence, chatId, chatType, name, avatarUrl, content, type, time, timeText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSearchMessage)) {
            return false;
        }
        ChatSearchMessage chatSearchMessage = (ChatSearchMessage) other;
        return Intrinsics.areEqual(this.id, chatSearchMessage.id) && this.sequence == chatSearchMessage.sequence && Intrinsics.areEqual(this.chatId, chatSearchMessage.chatId) && this.chatType == chatSearchMessage.chatType && Intrinsics.areEqual(this.name, chatSearchMessage.name) && Intrinsics.areEqual(this.avatarUrl, chatSearchMessage.avatarUrl) && Intrinsics.areEqual(this.content, chatSearchMessage.content) && Intrinsics.areEqual(this.type, chatSearchMessage.type) && this.time == chatSearchMessage.time && Intrinsics.areEqual(this.timeText, chatSearchMessage.timeText);
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + Long.hashCode(this.sequence)) * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.name.hashCode()) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + this.content.hashCode()) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + this.timeText.hashCode();
    }

    public String toString() {
        return "ChatSearchMessage(id=" + this.id + ", sequence=" + this.sequence + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", content=" + this.content + ", type=" + this.type + ", time=" + this.time + ", timeText=" + this.timeText + ")";
    }

    public ChatSearchMessage(String id, long sequence, String chatId, int chatType, String name, String avatarUrl, String content, String type, long time, String timeText) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeText, "timeText");
        this.id = id;
        this.sequence = sequence;
        this.chatId = chatId;
        this.chatType = chatType;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.content = content;
        this.type = type;
        this.time = time;
        this.timeText = timeText;
    }

    public final String getId() {
        return this.id;
    }

    public final long getSequence() {
        return this.sequence;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getType() {
        return this.type;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getTimeText() {
        return this.timeText;
    }
}
