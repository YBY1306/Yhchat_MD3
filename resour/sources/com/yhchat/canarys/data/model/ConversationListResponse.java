package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Conversation.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001J\t\u0010 \u001a\u00020\nH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ConversationListResponse;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/yhchat/canarys/data/model/ApiStatus;", "data", "", "Lcom/yhchat/canarys/data/model/Conversation;", "total", "", "requestId", "", "<init>", "(Lcom/yhchat/canarys/data/model/ApiStatus;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getStatus", "()Lcom/yhchat/canarys/data/model/ApiStatus;", "getData", "()Ljava/util/List;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRequestId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Lcom/yhchat/canarys/data/model/ApiStatus;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/ConversationListResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ConversationListResponse {
    public static final int $stable = 8;

    @SerializedName("data")
    private final List<Conversation> data;

    @SerializedName("request_id")
    private final String requestId;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final ApiStatus status;

    @SerializedName("total")
    private final Integer total;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationListResponse copy$default(ConversationListResponse conversationListResponse, ApiStatus apiStatus, List list, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            apiStatus = conversationListResponse.status;
        }
        if ((i & 2) != 0) {
            list = conversationListResponse.data;
        }
        if ((i & 4) != 0) {
            num = conversationListResponse.total;
        }
        if ((i & 8) != 0) {
            str = conversationListResponse.requestId;
        }
        return conversationListResponse.copy(apiStatus, list, num, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiStatus getStatus() {
        return this.status;
    }

    public final List<Conversation> component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final ConversationListResponse copy(ApiStatus status, List<Conversation> data, Integer total, String requestId) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new ConversationListResponse(status, data, total, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationListResponse)) {
            return false;
        }
        ConversationListResponse conversationListResponse = (ConversationListResponse) other;
        return Intrinsics.areEqual(this.status, conversationListResponse.status) && Intrinsics.areEqual(this.data, conversationListResponse.data) && Intrinsics.areEqual(this.total, conversationListResponse.total) && Intrinsics.areEqual(this.requestId, conversationListResponse.requestId);
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + (this.data == null ? 0 : this.data.hashCode())) * 31) + (this.total == null ? 0 : this.total.hashCode())) * 31) + (this.requestId != null ? this.requestId.hashCode() : 0);
    }

    public String toString() {
        return "ConversationListResponse(status=" + this.status + ", data=" + this.data + ", total=" + this.total + ", requestId=" + this.requestId + ")";
    }

    public ConversationListResponse(ApiStatus status, List<Conversation> list, Integer total, String requestId) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = list;
        this.total = total;
        this.requestId = requestId;
    }

    public /* synthetic */ ConversationListResponse(ApiStatus apiStatus, List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiStatus, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }

    public final ApiStatus getStatus() {
        return this.status;
    }

    public final List<Conversation> getData() {
        return this.data;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final String getRequestId() {
        return this.requestId;
    }
}
