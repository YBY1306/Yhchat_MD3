package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BoardsByCreateItem;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "avatar", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getAvatar", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BoardsByCreateItem {
    public static final int $stable = 0;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    public static /* synthetic */ BoardsByCreateItem copy$default(BoardsByCreateItem boardsByCreateItem, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = boardsByCreateItem.id;
        }
        if ((i2 & 2) != 0) {
            str = boardsByCreateItem.name;
        }
        if ((i2 & 4) != 0) {
            str2 = boardsByCreateItem.avatar;
        }
        return boardsByCreateItem.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    public final BoardsByCreateItem copy(int id, String name, String avatar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new BoardsByCreateItem(id, name, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardsByCreateItem)) {
            return false;
        }
        BoardsByCreateItem boardsByCreateItem = (BoardsByCreateItem) other;
        return this.id == boardsByCreateItem.id && Intrinsics.areEqual(this.name, boardsByCreateItem.name) && Intrinsics.areEqual(this.avatar, boardsByCreateItem.avatar);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.avatar.hashCode();
    }

    public String toString() {
        return "BoardsByCreateItem(id=" + this.id + ", name=" + this.name + ", avatar=" + this.avatar + ")";
    }

    public BoardsByCreateItem(int id, String name, String avatar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatar() {
        return this.avatar;
    }
}
