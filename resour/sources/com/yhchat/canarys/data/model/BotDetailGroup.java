package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotDetailGroup;", "", "groupId", "", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "headcount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getGroupId", "()Ljava/lang/String;", "getName", "getIntroduction", "getAvatarUrl", "getHeadcount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotDetailGroup {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    public static /* synthetic */ BotDetailGroup copy$default(BotDetailGroup botDetailGroup, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = botDetailGroup.groupId;
        }
        if ((i2 & 2) != 0) {
            str2 = botDetailGroup.name;
        }
        if ((i2 & 4) != 0) {
            str3 = botDetailGroup.introduction;
        }
        if ((i2 & 8) != 0) {
            str4 = botDetailGroup.avatarUrl;
        }
        if ((i2 & 16) != 0) {
            i = botDetailGroup.headcount;
        }
        int i3 = i;
        String str5 = str3;
        return botDetailGroup.copy(str, str2, str5, str4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHeadcount() {
        return this.headcount;
    }

    public final BotDetailGroup copy(String groupId, String name, String introduction, String avatarUrl, int headcount) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        return new BotDetailGroup(groupId, name, introduction, avatarUrl, headcount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotDetailGroup)) {
            return false;
        }
        BotDetailGroup botDetailGroup = (BotDetailGroup) other;
        return Intrinsics.areEqual(this.groupId, botDetailGroup.groupId) && Intrinsics.areEqual(this.name, botDetailGroup.name) && Intrinsics.areEqual(this.introduction, botDetailGroup.introduction) && Intrinsics.areEqual(this.avatarUrl, botDetailGroup.avatarUrl) && this.headcount == botDetailGroup.headcount;
    }

    public int hashCode() {
        return (((((((this.groupId.hashCode() * 31) + this.name.hashCode()) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + (this.avatarUrl != null ? this.avatarUrl.hashCode() : 0)) * 31) + Integer.hashCode(this.headcount);
    }

    public String toString() {
        return "BotDetailGroup(groupId=" + this.groupId + ", name=" + this.name + ", introduction=" + this.introduction + ", avatarUrl=" + this.avatarUrl + ", headcount=" + this.headcount + ")";
    }

    public BotDetailGroup(String groupId, String name, String introduction, String avatarUrl, int headcount) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.avatarUrl = avatarUrl;
        this.headcount = headcount;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getHeadcount() {
        return this.headcount;
    }
}
