package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/model/Medal;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "desc", "imageUrl", "sort", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getDesc", "getImageUrl", "getSort", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Medal {
    public static final int $stable = 0;

    @SerializedName("desc")
    private final String desc;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("sort")
    private final int sort;

    public static /* synthetic */ Medal copy$default(Medal medal, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = medal.id;
        }
        if ((i3 & 2) != 0) {
            str = medal.name;
        }
        if ((i3 & 4) != 0) {
            str2 = medal.desc;
        }
        if ((i3 & 8) != 0) {
            str3 = medal.imageUrl;
        }
        if ((i3 & 16) != 0) {
            i2 = medal.sort;
        }
        int i4 = i2;
        String str4 = str2;
        return medal.copy(i, str, str4, str3, i4);
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
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final Medal copy(int id, String name, String desc, String imageUrl, int sort) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new Medal(id, name, desc, imageUrl, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Medal)) {
            return false;
        }
        Medal medal = (Medal) other;
        return this.id == medal.id && Intrinsics.areEqual(this.name, medal.name) && Intrinsics.areEqual(this.desc, medal.desc) && Intrinsics.areEqual(this.imageUrl, medal.imageUrl) && this.sort == medal.sort;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "Medal(id=" + this.id + ", name=" + this.name + ", desc=" + this.desc + ", imageUrl=" + this.imageUrl + ", sort=" + this.sort + ")";
    }

    public Medal(int id, String name, String desc, String imageUrl, int sort) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.imageUrl = imageUrl;
        this.sort = sort;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getSort() {
        return this.sort;
    }
}
