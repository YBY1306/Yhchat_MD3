package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J.\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MessageStatus;", "", "number", "", "code", "", "message", "", "<init>", "(Ljava/lang/Long;ILjava/lang/String;)V", "getNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;ILjava/lang/String;)Lcom/yhchat/canarys/data/model/MessageStatus;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MessageStatus {
    public static final int $stable = 0;

    @SerializedName("code")
    private final int code;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String message;

    @SerializedName("number")
    private final Long number;

    public static /* synthetic */ MessageStatus copy$default(MessageStatus messageStatus, Long l, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = messageStatus.number;
        }
        if ((i2 & 2) != 0) {
            i = messageStatus.code;
        }
        if ((i2 & 4) != 0) {
            str = messageStatus.message;
        }
        return messageStatus.copy(l, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final MessageStatus copy(Long number, int code, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new MessageStatus(number, code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageStatus)) {
            return false;
        }
        MessageStatus messageStatus = (MessageStatus) other;
        return Intrinsics.areEqual(this.number, messageStatus.number) && this.code == messageStatus.code && Intrinsics.areEqual(this.message, messageStatus.message);
    }

    public int hashCode() {
        return ((((this.number == null ? 0 : this.number.hashCode()) * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "MessageStatus(number=" + this.number + ", code=" + this.code + ", message=" + this.message + ")";
    }

    public MessageStatus(Long number, int code, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.number = number;
        this.code = code;
        this.message = message;
    }

    public /* synthetic */ MessageStatus(Long l, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, i, str);
    }

    public final Long getNumber() {
        return this.number;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
