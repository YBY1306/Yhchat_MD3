package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/data/api/MenuEventRequest;", "", Name.MARK, "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "value", "<init>", "(JLjava/lang/String;ILjava/lang/String;)V", "getId", "()J", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MenuEventRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("value")
    private final String value;

    public static /* synthetic */ MenuEventRequest copy$default(MenuEventRequest menuEventRequest, long j, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = menuEventRequest.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = menuEventRequest.chatId;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = menuEventRequest.chatType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = menuEventRequest.value;
        }
        return menuEventRequest.copy(j2, str3, i3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
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
    public final String getValue() {
        return this.value;
    }

    public final MenuEventRequest copy(long id, String chatId, int chatType, String value) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(value, "value");
        return new MenuEventRequest(id, chatId, chatType, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuEventRequest)) {
            return false;
        }
        MenuEventRequest menuEventRequest = (MenuEventRequest) other;
        return this.id == menuEventRequest.id && Intrinsics.areEqual(this.chatId, menuEventRequest.chatId) && this.chatType == menuEventRequest.chatType && Intrinsics.areEqual(this.value, menuEventRequest.value);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "MenuEventRequest(id=" + this.id + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", value=" + this.value + ")";
    }

    public MenuEventRequest(long id, String chatId, int chatType, String value) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.id = id;
        this.chatId = chatId;
        this.chatType = chatType;
        this.value = value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MenuEventRequest(long j, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        if ((i2 & 8) == 0) {
            str3 = str2;
        } else {
            str3 = "";
        }
        this(j, str, i, str3);
    }

    public final long getId() {
        return this.id;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getValue() {
        return this.value;
    }
}
