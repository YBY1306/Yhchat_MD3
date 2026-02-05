package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/api/ButtonReportRequest;", "", "msgId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_ID, "userId", "buttonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "getChatType", "()I", "getChatId", "getUserId", "getButtonValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ButtonReportRequest {
    public static final int $stable = 0;

    @SerializedName("button_value")
    private final String buttonValue;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("msg_id")
    private final String msgId;

    @SerializedName("user_id")
    private final String userId;

    public static /* synthetic */ ButtonReportRequest copy$default(ButtonReportRequest buttonReportRequest, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buttonReportRequest.msgId;
        }
        if ((i2 & 2) != 0) {
            i = buttonReportRequest.chatType;
        }
        if ((i2 & 4) != 0) {
            str2 = buttonReportRequest.chatId;
        }
        if ((i2 & 8) != 0) {
            str3 = buttonReportRequest.userId;
        }
        if ((i2 & 16) != 0) {
            str4 = buttonReportRequest.buttonValue;
        }
        String str5 = str4;
        String str6 = str2;
        return buttonReportRequest.copy(str, i, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonValue() {
        return this.buttonValue;
    }

    public final ButtonReportRequest copy(String msgId, int chatType, String chatId, String userId, String buttonValue) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(buttonValue, "buttonValue");
        return new ButtonReportRequest(msgId, chatType, chatId, userId, buttonValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonReportRequest)) {
            return false;
        }
        ButtonReportRequest buttonReportRequest = (ButtonReportRequest) other;
        return Intrinsics.areEqual(this.msgId, buttonReportRequest.msgId) && this.chatType == buttonReportRequest.chatType && Intrinsics.areEqual(this.chatId, buttonReportRequest.chatId) && Intrinsics.areEqual(this.userId, buttonReportRequest.userId) && Intrinsics.areEqual(this.buttonValue, buttonReportRequest.buttonValue);
    }

    public int hashCode() {
        return (((((((this.msgId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + this.chatId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.buttonValue.hashCode();
    }

    public String toString() {
        return "ButtonReportRequest(msgId=" + this.msgId + ", chatType=" + this.chatType + ", chatId=" + this.chatId + ", userId=" + this.userId + ", buttonValue=" + this.buttonValue + ")";
    }

    public ButtonReportRequest(String msgId, int chatType, String chatId, String userId, String buttonValue) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(buttonValue, "buttonValue");
        this.msgId = msgId;
        this.chatType = chatType;
        this.chatId = chatId;
        this.userId = userId;
        this.buttonValue = buttonValue;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getButtonValue() {
        return this.buttonValue;
    }
}
