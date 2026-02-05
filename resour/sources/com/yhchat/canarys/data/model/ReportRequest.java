package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Report.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/model/ReportRequest;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "content", "url", "reason", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getChatName", "getContent", "getUrl", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReportRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_NAME)
    private final String chatName;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("content")
    private final String content;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("url")
    private final String url;

    public static /* synthetic */ ReportRequest copy$default(ReportRequest reportRequest, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reportRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            i = reportRequest.chatType;
        }
        if ((i2 & 4) != 0) {
            str2 = reportRequest.chatName;
        }
        if ((i2 & 8) != 0) {
            str3 = reportRequest.content;
        }
        if ((i2 & 16) != 0) {
            str4 = reportRequest.url;
        }
        if ((i2 & 32) != 0) {
            str5 = reportRequest.reason;
        }
        String str6 = str4;
        String str7 = str5;
        return reportRequest.copy(str, i, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatName() {
        return this.chatName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final ReportRequest copy(String chatId, int chatType, String chatName, String content, String url, String reason) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ReportRequest(chatId, chatType, chatName, content, url, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportRequest)) {
            return false;
        }
        ReportRequest reportRequest = (ReportRequest) other;
        return Intrinsics.areEqual(this.chatId, reportRequest.chatId) && this.chatType == reportRequest.chatType && Intrinsics.areEqual(this.chatName, reportRequest.chatName) && Intrinsics.areEqual(this.content, reportRequest.content) && Intrinsics.areEqual(this.url, reportRequest.url) && Intrinsics.areEqual(this.reason, reportRequest.reason);
    }

    public int hashCode() {
        return (((((((((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + this.chatName.hashCode()) * 31) + this.content.hashCode()) * 31) + this.url.hashCode()) * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "ReportRequest(chatId=" + this.chatId + ", chatType=" + this.chatType + ", chatName=" + this.chatName + ", content=" + this.content + ", url=" + this.url + ", reason=" + this.reason + ")";
    }

    public ReportRequest(String chatId, int chatType, String chatName, String content, String url, String reason) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.chatId = chatId;
        this.chatType = chatType;
        this.chatName = chatName;
        this.content = content;
        this.url = url;
        this.reason = reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReportRequest(String str, int i, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        str4 = (i2 & 16) != 0 ? "" : str4;
        if ((i2 & 32) == 0) {
            str6 = str5;
        } else {
            str6 = "";
        }
        this(str, i, str2, str3, str4, str6);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getReason() {
        return this.reason;
    }
}
