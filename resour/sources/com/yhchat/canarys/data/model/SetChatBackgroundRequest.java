package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatBackground.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/SetChatBackgroundRequest;", "", "userId", "", ChatSearchActivity.EXTRA_CHAT_ID, "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getChatId", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SetChatBackgroundRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName("url")
    private final String url;

    @SerializedName("userId")
    private final String userId;

    public static /* synthetic */ SetChatBackgroundRequest copy$default(SetChatBackgroundRequest setChatBackgroundRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setChatBackgroundRequest.userId;
        }
        if ((i & 2) != 0) {
            str2 = setChatBackgroundRequest.chatId;
        }
        if ((i & 4) != 0) {
            str3 = setChatBackgroundRequest.url;
        }
        return setChatBackgroundRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final SetChatBackgroundRequest copy(String userId, String chatId, String url) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(url, "url");
        return new SetChatBackgroundRequest(userId, chatId, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetChatBackgroundRequest)) {
            return false;
        }
        SetChatBackgroundRequest setChatBackgroundRequest = (SetChatBackgroundRequest) other;
        return Intrinsics.areEqual(this.userId, setChatBackgroundRequest.userId) && Intrinsics.areEqual(this.chatId, setChatBackgroundRequest.chatId) && Intrinsics.areEqual(this.url, setChatBackgroundRequest.url);
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "SetChatBackgroundRequest(userId=" + this.userId + ", chatId=" + this.chatId + ", url=" + this.url + ")";
    }

    public SetChatBackgroundRequest(String userId, String chatId, String url) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.userId = userId;
        this.chatId = chatId;
        this.url = url;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getUrl() {
        return this.url;
    }
}
