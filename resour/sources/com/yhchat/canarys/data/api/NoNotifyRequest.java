package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/data/api/NoNotifyRequest;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", "noNotify", "", "<init>", "(Ljava/lang/String;I)V", "getChatId", "()Ljava/lang/String;", "getNoNotify", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class NoNotifyRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName("noNotify")
    private final int noNotify;

    public static /* synthetic */ NoNotifyRequest copy$default(NoNotifyRequest noNotifyRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noNotifyRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            i = noNotifyRequest.noNotify;
        }
        return noNotifyRequest.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNoNotify() {
        return this.noNotify;
    }

    public final NoNotifyRequest copy(String chatId, int noNotify) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new NoNotifyRequest(chatId, noNotify);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoNotifyRequest)) {
            return false;
        }
        NoNotifyRequest noNotifyRequest = (NoNotifyRequest) other;
        return Intrinsics.areEqual(this.chatId, noNotifyRequest.chatId) && this.noNotify == noNotifyRequest.noNotify;
    }

    public int hashCode() {
        return (this.chatId.hashCode() * 31) + Integer.hashCode(this.noNotify);
    }

    public String toString() {
        return "NoNotifyRequest(chatId=" + this.chatId + ", noNotify=" + this.noNotify + ")";
    }

    public NoNotifyRequest(String chatId, int noNotify) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatId = chatId;
        this.noNotify = noNotify;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getNoNotify() {
        return this.noNotify;
    }
}
