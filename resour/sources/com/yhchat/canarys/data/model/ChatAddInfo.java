package com.yhchat.canarys.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ChatAddInfo;", "", Name.MARK, "", "type", "Lcom/yhchat/canarys/data/model/ChatAddType;", "displayName", "avatarUrl", "description", "additionalInfo", "<init>", "(Ljava/lang/String;Lcom/yhchat/canarys/data/model/ChatAddType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/yhchat/canarys/data/model/ChatAddType;", "getDisplayName", "getAvatarUrl", "getDescription", "getAdditionalInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ChatAddInfo {
    public static final int $stable = 0;
    private final String additionalInfo;
    private final String avatarUrl;
    private final String description;
    private final String displayName;
    private final String id;
    private final ChatAddType type;

    public static /* synthetic */ ChatAddInfo copy$default(ChatAddInfo chatAddInfo, String str, ChatAddType chatAddType, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatAddInfo.id;
        }
        if ((i & 2) != 0) {
            chatAddType = chatAddInfo.type;
        }
        if ((i & 4) != 0) {
            str2 = chatAddInfo.displayName;
        }
        if ((i & 8) != 0) {
            str3 = chatAddInfo.avatarUrl;
        }
        if ((i & 16) != 0) {
            str4 = chatAddInfo.description;
        }
        if ((i & 32) != 0) {
            str5 = chatAddInfo.additionalInfo;
        }
        String str6 = str4;
        String str7 = str5;
        return chatAddInfo.copy(str, chatAddType, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ChatAddType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final ChatAddInfo copy(String id, ChatAddType type, String displayName, String avatarUrl, String description, String additionalInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new ChatAddInfo(id, type, displayName, avatarUrl, description, additionalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatAddInfo)) {
            return false;
        }
        ChatAddInfo chatAddInfo = (ChatAddInfo) other;
        return Intrinsics.areEqual(this.id, chatAddInfo.id) && this.type == chatAddInfo.type && Intrinsics.areEqual(this.displayName, chatAddInfo.displayName) && Intrinsics.areEqual(this.avatarUrl, chatAddInfo.avatarUrl) && Intrinsics.areEqual(this.description, chatAddInfo.description) && Intrinsics.areEqual(this.additionalInfo, chatAddInfo.additionalInfo);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.description.hashCode()) * 31) + this.additionalInfo.hashCode();
    }

    public String toString() {
        return "ChatAddInfo(id=" + this.id + ", type=" + this.type + ", displayName=" + this.displayName + ", avatarUrl=" + this.avatarUrl + ", description=" + this.description + ", additionalInfo=" + this.additionalInfo + ")";
    }

    public ChatAddInfo(String id, ChatAddType type, String displayName, String avatarUrl, String description, String additionalInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.id = id;
        this.type = type;
        this.displayName = displayName;
        this.avatarUrl = avatarUrl;
        this.description = description;
        this.additionalInfo = additionalInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatAddInfo(String str, ChatAddType chatAddType, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        if ((i & 32) == 0) {
            str6 = str5;
        } else {
            str6 = "";
        }
        this(str, chatAddType, str2, str3, str4, str6);
    }

    public final String getId() {
        return this.id;
    }

    public final ChatAddType getType() {
        return this.type;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }
}
