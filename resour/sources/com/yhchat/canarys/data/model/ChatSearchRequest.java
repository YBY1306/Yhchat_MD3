package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatSearchModels.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ChatSearchRequest;", "", "word", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "type", "size", "time", "", "direction", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IJI)V", "getWord", "()Ljava/lang/String;", "getChatId", "getChatType", "()I", "getType", "getSize", "getTime", "()J", "getDirection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ChatSearchRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("direction")
    private final int direction;

    @SerializedName("size")
    private final int size;

    @SerializedName("time")
    private final long time;

    @SerializedName("type")
    private final String type;

    @SerializedName("word")
    private final String word;

    public static /* synthetic */ ChatSearchRequest copy$default(ChatSearchRequest chatSearchRequest, String str, String str2, int i, String str3, int i2, long j, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = chatSearchRequest.word;
        }
        if ((i4 & 2) != 0) {
            str2 = chatSearchRequest.chatId;
        }
        if ((i4 & 4) != 0) {
            i = chatSearchRequest.chatType;
        }
        if ((i4 & 8) != 0) {
            str3 = chatSearchRequest.type;
        }
        if ((i4 & 16) != 0) {
            i2 = chatSearchRequest.size;
        }
        if ((i4 & 32) != 0) {
            j = chatSearchRequest.time;
        }
        if ((i4 & 64) != 0) {
            i3 = chatSearchRequest.direction;
        }
        int i5 = i3;
        long j2 = j;
        int i6 = i2;
        int i7 = i;
        return chatSearchRequest.copy(str, str2, i7, str3, i6, j2, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWord() {
        return this.word;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDirection() {
        return this.direction;
    }

    public final ChatSearchRequest copy(String word, String chatId, int chatType, String type, int size, long time, int direction) {
        Intrinsics.checkNotNullParameter(word, "word");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ChatSearchRequest(word, chatId, chatType, type, size, time, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSearchRequest)) {
            return false;
        }
        ChatSearchRequest chatSearchRequest = (ChatSearchRequest) other;
        return Intrinsics.areEqual(this.word, chatSearchRequest.word) && Intrinsics.areEqual(this.chatId, chatSearchRequest.chatId) && this.chatType == chatSearchRequest.chatType && Intrinsics.areEqual(this.type, chatSearchRequest.type) && this.size == chatSearchRequest.size && this.time == chatSearchRequest.time && this.direction == chatSearchRequest.direction;
    }

    public int hashCode() {
        return (((((((((((this.word.hashCode() * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.direction);
    }

    public String toString() {
        return "ChatSearchRequest(word=" + this.word + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", type=" + this.type + ", size=" + this.size + ", time=" + this.time + ", direction=" + this.direction + ")";
    }

    public ChatSearchRequest(String word, String chatId, int chatType, String type, int size, long time, int direction) {
        Intrinsics.checkNotNullParameter(word, "word");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.word = word;
        this.chatId = chatId;
        this.chatType = chatType;
        this.type = type;
        this.size = size;
        this.time = time;
        this.direction = direction;
    }

    public /* synthetic */ ChatSearchRequest(String str, String str2, int i, String str3, int i2, long j, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i4 & 8) != 0 ? "all" : str3, (i4 & 16) != 0 ? 30 : i2, (i4 & 32) != 0 ? 9999999999999L : j, (i4 & 64) != 0 ? 1 : i3);
    }

    public final String getWord() {
        return this.word;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getType() {
        return this.type;
    }

    public final int getSize() {
        return this.size;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getDirection() {
        return this.direction;
    }
}
