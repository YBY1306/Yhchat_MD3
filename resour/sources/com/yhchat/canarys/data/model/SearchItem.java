package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/model/SearchItem;", "", "friendId", "", "friendType", "", "nickname", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "hit", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFriendId", "()Ljava/lang/String;", "getFriendType", "()I", "getNickname", "getName", "getAvatarUrl", "getHit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SearchItem {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("friendId")
    private final String friendId;

    @SerializedName("friendType")
    private final int friendType;

    @SerializedName("hit")
    private final int hit;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("nickname")
    private final String nickname;

    public static /* synthetic */ SearchItem copy$default(SearchItem searchItem, String str, int i, String str2, String str3, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = searchItem.friendId;
        }
        if ((i3 & 2) != 0) {
            i = searchItem.friendType;
        }
        if ((i3 & 4) != 0) {
            str2 = searchItem.nickname;
        }
        if ((i3 & 8) != 0) {
            str3 = searchItem.name;
        }
        if ((i3 & 16) != 0) {
            str4 = searchItem.avatarUrl;
        }
        if ((i3 & 32) != 0) {
            i2 = searchItem.hit;
        }
        String str5 = str4;
        int i4 = i2;
        return searchItem.copy(str, i, str2, str3, str5, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFriendId() {
        return this.friendId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFriendType() {
        return this.friendType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final int getHit() {
        return this.hit;
    }

    public final SearchItem copy(String friendId, int friendType, String nickname, String name, String avatarUrl, int hit) {
        Intrinsics.checkNotNullParameter(friendId, "friendId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new SearchItem(friendId, friendType, nickname, name, avatarUrl, hit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchItem)) {
            return false;
        }
        SearchItem searchItem = (SearchItem) other;
        return Intrinsics.areEqual(this.friendId, searchItem.friendId) && this.friendType == searchItem.friendType && Intrinsics.areEqual(this.nickname, searchItem.nickname) && Intrinsics.areEqual(this.name, searchItem.name) && Intrinsics.areEqual(this.avatarUrl, searchItem.avatarUrl) && this.hit == searchItem.hit;
    }

    public int hashCode() {
        return (((((((((this.friendId.hashCode() * 31) + Integer.hashCode(this.friendType)) * 31) + this.nickname.hashCode()) * 31) + (this.name == null ? 0 : this.name.hashCode())) * 31) + this.avatarUrl.hashCode()) * 31) + Integer.hashCode(this.hit);
    }

    public String toString() {
        return "SearchItem(friendId=" + this.friendId + ", friendType=" + this.friendType + ", nickname=" + this.nickname + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", hit=" + this.hit + ")";
    }

    public SearchItem(String friendId, int friendType, String nickname, String name, String avatarUrl, int hit) {
        Intrinsics.checkNotNullParameter(friendId, "friendId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.friendId = friendId;
        this.friendType = friendType;
        this.nickname = nickname;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.hit = hit;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SearchItem(String str, int i, String str2, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        if ((i3 & 8) == 0) {
            str5 = str3;
        } else {
            str5 = null;
        }
        this(str, i, str2, str5, str4, i2);
    }

    public final String getFriendId() {
        return this.friendId;
    }

    public final int getFriendType() {
        return this.friendType;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getHit() {
        return this.hit;
    }
}
