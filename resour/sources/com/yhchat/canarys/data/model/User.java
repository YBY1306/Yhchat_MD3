package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\nH\u00d6\u0001J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006/"}, m169d2 = {"Lcom/yhchat/canarys/data/model/User;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "avatarId", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "tags", "", "Lcom/yhchat/canarys/data/model/Tag;", "certificationLevel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getName", "getAvatarUrl", "getAvatarId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getChatId", "getChatType", "()I", "getTags", "()Ljava/util/List;", "getCertificationLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;)Lcom/yhchat/canarys/data/model/User;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class User {
    public static final int $stable = 8;

    @SerializedName("avatar_id")
    private final Long avatarId;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("certification_level")
    private final Integer certificationLevel;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName(Name.MARK)
    private final String id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("tag")
    private final List<Tag> tags;

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, Long l, String str4, int i, List list, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = user.id;
        }
        if ((i2 & 2) != 0) {
            str2 = user.name;
        }
        if ((i2 & 4) != 0) {
            str3 = user.avatarUrl;
        }
        if ((i2 & 8) != 0) {
            l = user.avatarId;
        }
        if ((i2 & 16) != 0) {
            str4 = user.chatId;
        }
        if ((i2 & 32) != 0) {
            i = user.chatType;
        }
        if ((i2 & 64) != 0) {
            list = user.tags;
        }
        if ((i2 & 128) != 0) {
            num = user.certificationLevel;
        }
        List list2 = list;
        Integer num2 = num;
        String str5 = str4;
        int i3 = i;
        return user.copy(str, str2, str3, l, str5, i3, list2, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    public final List<Tag> component7() {
        return this.tags;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getCertificationLevel() {
        return this.certificationLevel;
    }

    public final User copy(String id, String name, String avatarUrl, Long avatarId, String chatId, int chatType, List<Tag> tags, Integer certificationLevel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new User(id, name, avatarUrl, avatarId, chatId, chatType, tags, certificationLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.name, user.name) && Intrinsics.areEqual(this.avatarUrl, user.avatarUrl) && Intrinsics.areEqual(this.avatarId, user.avatarId) && Intrinsics.areEqual(this.chatId, user.chatId) && this.chatType == user.chatType && Intrinsics.areEqual(this.tags, user.tags) && Intrinsics.areEqual(this.certificationLevel, user.certificationLevel);
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + (this.avatarId == null ? 0 : this.avatarId.hashCode())) * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + (this.tags == null ? 0 : this.tags.hashCode())) * 31) + (this.certificationLevel != null ? this.certificationLevel.hashCode() : 0);
    }

    public String toString() {
        return "User(id=" + this.id + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", avatarId=" + this.avatarId + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", tags=" + this.tags + ", certificationLevel=" + this.certificationLevel + ")";
    }

    public User(String id, String name, String avatarUrl, Long avatarId, String chatId, int chatType, List<Tag> list, Integer certificationLevel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.avatarId = avatarId;
        this.chatId = chatId;
        this.chatType = chatType;
        this.tags = list;
        this.certificationLevel = certificationLevel;
    }

    public /* synthetic */ User(String str, String str2, String str3, Long l, String str4, int i, List list, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : l, str4, i, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : num);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Long getAvatarId() {
        return this.avatarId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final List<Tag> getTags() {
        return this.tags;
    }

    public final Integer getCertificationLevel() {
        return this.certificationLevel;
    }
}
