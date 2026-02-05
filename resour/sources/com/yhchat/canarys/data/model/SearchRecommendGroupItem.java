package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Js\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\bH\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/data/model/SearchRecommendGroupItem;", "", "groupId", "", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "headcount", "", "createTime", "", "banId", "alwaysAgree", "categoryId", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJIIILjava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getName", "getIntroduction", "getAvatarUrl", "getHeadcount", "()I", "getCreateTime", "()J", "getBanId", "getAlwaysAgree", "getCategoryId", "getCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SearchRecommendGroupItem {
    public static final int $stable = 0;

    @SerializedName("alwaysAgree")
    private final int alwaysAgree;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("banId")
    private final int banId;

    @SerializedName("category")
    private final String category;

    @SerializedName("categoryId")
    private final int categoryId;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    public static /* synthetic */ SearchRecommendGroupItem copy$default(SearchRecommendGroupItem searchRecommendGroupItem, String str, String str2, String str3, String str4, int i, long j, int i2, int i3, int i4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = searchRecommendGroupItem.groupId;
        }
        if ((i5 & 2) != 0) {
            str2 = searchRecommendGroupItem.name;
        }
        if ((i5 & 4) != 0) {
            str3 = searchRecommendGroupItem.introduction;
        }
        if ((i5 & 8) != 0) {
            str4 = searchRecommendGroupItem.avatarUrl;
        }
        if ((i5 & 16) != 0) {
            i = searchRecommendGroupItem.headcount;
        }
        if ((i5 & 32) != 0) {
            j = searchRecommendGroupItem.createTime;
        }
        if ((i5 & 64) != 0) {
            i2 = searchRecommendGroupItem.banId;
        }
        if ((i5 & 128) != 0) {
            i3 = searchRecommendGroupItem.alwaysAgree;
        }
        if ((i5 & 256) != 0) {
            i4 = searchRecommendGroupItem.categoryId;
        }
        if ((i5 & 512) != 0) {
            str5 = searchRecommendGroupItem.category;
        }
        long j2 = j;
        String str6 = str4;
        int i6 = i;
        String str7 = str3;
        return searchRecommendGroupItem.copy(str, str2, str7, str6, i6, j2, i2, i3, i4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCategory() {
        return this.category;
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

    /* renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBanId() {
        return this.banId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    public final SearchRecommendGroupItem copy(String groupId, String name, String introduction, String avatarUrl, int headcount, long createTime, int banId, int alwaysAgree, int categoryId, String category) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        return new SearchRecommendGroupItem(groupId, name, introduction, avatarUrl, headcount, createTime, banId, alwaysAgree, categoryId, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRecommendGroupItem)) {
            return false;
        }
        SearchRecommendGroupItem searchRecommendGroupItem = (SearchRecommendGroupItem) other;
        return Intrinsics.areEqual(this.groupId, searchRecommendGroupItem.groupId) && Intrinsics.areEqual(this.name, searchRecommendGroupItem.name) && Intrinsics.areEqual(this.introduction, searchRecommendGroupItem.introduction) && Intrinsics.areEqual(this.avatarUrl, searchRecommendGroupItem.avatarUrl) && this.headcount == searchRecommendGroupItem.headcount && this.createTime == searchRecommendGroupItem.createTime && this.banId == searchRecommendGroupItem.banId && this.alwaysAgree == searchRecommendGroupItem.alwaysAgree && this.categoryId == searchRecommendGroupItem.categoryId && Intrinsics.areEqual(this.category, searchRecommendGroupItem.category);
    }

    public int hashCode() {
        return (((((((((((((((((this.groupId.hashCode() * 31) + this.name.hashCode()) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + Integer.hashCode(this.headcount)) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.banId)) * 31) + Integer.hashCode(this.alwaysAgree)) * 31) + Integer.hashCode(this.categoryId)) * 31) + (this.category != null ? this.category.hashCode() : 0);
    }

    public String toString() {
        return "SearchRecommendGroupItem(groupId=" + this.groupId + ", name=" + this.name + ", introduction=" + this.introduction + ", avatarUrl=" + this.avatarUrl + ", headcount=" + this.headcount + ", createTime=" + this.createTime + ", banId=" + this.banId + ", alwaysAgree=" + this.alwaysAgree + ", categoryId=" + this.categoryId + ", category=" + this.category + ")";
    }

    public SearchRecommendGroupItem(String groupId, String name, String introduction, String avatarUrl, int headcount, long createTime, int banId, int alwaysAgree, int categoryId, String category) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.avatarUrl = avatarUrl;
        this.headcount = headcount;
        this.createTime = createTime;
        this.banId = banId;
        this.alwaysAgree = alwaysAgree;
        this.categoryId = categoryId;
        this.category = category;
    }

    public /* synthetic */ SearchRecommendGroupItem(String str, String str2, String str3, String str4, int i, long j, int i2, int i3, int i4, String str5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, j, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0 : i4, (i5 & 512) != 0 ? null : str5);
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

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getBanId() {
        return this.banId;
    }

    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getCategory() {
        return this.category;
    }
}
