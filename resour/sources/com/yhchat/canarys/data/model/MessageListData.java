package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MessageListData;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/yhchat/canarys/data/model/MessageStatus;", "messages", "", "Lcom/yhchat/canarys/data/model/ChatMessage;", "total", "", "<init>", "(Lcom/yhchat/canarys/data/model/MessageStatus;Ljava/util/List;Ljava/lang/Integer;)V", "getStatus", "()Lcom/yhchat/canarys/data/model/MessageStatus;", "getMessages", "()Ljava/util/List;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/yhchat/canarys/data/model/MessageStatus;Ljava/util/List;Ljava/lang/Integer;)Lcom/yhchat/canarys/data/model/MessageListData;", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MessageListData {
    public static final int $stable = 8;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final List<ChatMessage> messages;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final MessageStatus status;

    @SerializedName("total")
    private final Integer total;

    public MessageListData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageListData copy$default(MessageListData messageListData, MessageStatus messageStatus, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            messageStatus = messageListData.status;
        }
        if ((i & 2) != 0) {
            list = messageListData.messages;
        }
        if ((i & 4) != 0) {
            num = messageListData.total;
        }
        return messageListData.copy(messageStatus, list, num);
    }

    /* renamed from: component1, reason: from getter */
    public final MessageStatus getStatus() {
        return this.status;
    }

    public final List<ChatMessage> component2() {
        return this.messages;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    public final MessageListData copy(MessageStatus status, List<ChatMessage> messages, Integer total) {
        return new MessageListData(status, messages, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListData)) {
            return false;
        }
        MessageListData messageListData = (MessageListData) other;
        return Intrinsics.areEqual(this.status, messageListData.status) && Intrinsics.areEqual(this.messages, messageListData.messages) && Intrinsics.areEqual(this.total, messageListData.total);
    }

    public int hashCode() {
        return ((((this.status == null ? 0 : this.status.hashCode()) * 31) + (this.messages == null ? 0 : this.messages.hashCode())) * 31) + (this.total != null ? this.total.hashCode() : 0);
    }

    public String toString() {
        return "MessageListData(status=" + this.status + ", messages=" + this.messages + ", total=" + this.total + ")";
    }

    public MessageListData(MessageStatus status, List<ChatMessage> list, Integer total) {
        this.status = status;
        this.messages = list;
        this.total = total;
    }

    public /* synthetic */ MessageListData(MessageStatus messageStatus, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : messageStatus, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }

    public final MessageStatus getStatus() {
        return this.status;
    }

    public final List<ChatMessage> getMessages() {
        return this.messages;
    }

    public final Integer getTotal() {
        return this.total;
    }
}
