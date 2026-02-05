package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u00c6\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MessageSender;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "tagOld", "", "tag", "Lcom/yhchat/canarys/data/model/MessageTag;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getName", "getAvatarUrl", "getTagOld", "()Ljava/util/List;", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MessageSender {
    public static final int $stable = 8;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("tag")
    private final List<MessageTag> tag;

    @SerializedName("tag_old")
    private final List<String> tagOld;

    public static /* synthetic */ MessageSender copy$default(MessageSender messageSender, String str, int i, String str2, String str3, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = messageSender.chatId;
        }
        if ((i2 & 2) != 0) {
            i = messageSender.chatType;
        }
        if ((i2 & 4) != 0) {
            str2 = messageSender.name;
        }
        if ((i2 & 8) != 0) {
            str3 = messageSender.avatarUrl;
        }
        if ((i2 & 16) != 0) {
            list = messageSender.tagOld;
        }
        if ((i2 & 32) != 0) {
            list2 = messageSender.tag;
        }
        List list3 = list;
        List list4 = list2;
        return messageSender.copy(str, i, str2, str3, list3, list4);
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
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final List<String> component5() {
        return this.tagOld;
    }

    public final List<MessageTag> component6() {
        return this.tag;
    }

    public final MessageSender copy(String chatId, int chatType, String name, String avatarUrl, List<String> tagOld, List<MessageTag> tag) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new MessageSender(chatId, chatType, name, avatarUrl, tagOld, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSender)) {
            return false;
        }
        MessageSender messageSender = (MessageSender) other;
        return Intrinsics.areEqual(this.chatId, messageSender.chatId) && this.chatType == messageSender.chatType && Intrinsics.areEqual(this.name, messageSender.name) && Intrinsics.areEqual(this.avatarUrl, messageSender.avatarUrl) && Intrinsics.areEqual(this.tagOld, messageSender.tagOld) && Intrinsics.areEqual(this.tag, messageSender.tag);
    }

    public int hashCode() {
        return (((((((((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + this.name.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + (this.tagOld == null ? 0 : this.tagOld.hashCode())) * 31) + (this.tag != null ? this.tag.hashCode() : 0);
    }

    public String toString() {
        return "MessageSender(chatId=" + this.chatId + ", chatType=" + this.chatType + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", tagOld=" + this.tagOld + ", tag=" + this.tag + ")";
    }

    public MessageSender(String chatId, int chatType, String name, String avatarUrl, List<String> list, List<MessageTag> list2) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.chatId = chatId;
        this.chatType = chatType;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.tagOld = list;
        this.tag = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageSender(String str, int i, String str2, String str3, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        list = (i2 & 16) != 0 ? null : list;
        if ((i2 & 32) == 0) {
            list3 = list2;
        } else {
            list3 = null;
        }
        this(str, i, str2, str3, list, list3);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final List<String> getTagOld() {
        return this.tagOld;
    }

    public final List<MessageTag> getTag() {
        return this.tag;
    }
}
