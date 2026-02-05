package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010'\u001a\u00020\bH\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u0010H\u00c6\u0003Ji\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/data/model/StickerPackDetail;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "createBy", "createTime", "", "userCount", "uuid", "updateTime", "stickerItems", "", "Lcom/yhchat/canarys/data/model/StickerItem;", "creator", "Lcom/yhchat/canarys/data/model/StickerPackCreator;", "<init>", "(ILjava/lang/String;Ljava/lang/String;JILjava/lang/String;JLjava/util/List;Lcom/yhchat/canarys/data/model/StickerPackCreator;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getCreateBy", "getCreateTime", "()J", "getUserCount", "getUuid", "getUpdateTime", "getStickerItems", "()Ljava/util/List;", "getCreator", "()Lcom/yhchat/canarys/data/model/StickerPackCreator;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StickerPackDetail {
    public static final int $stable = 8;
    private final String createBy;
    private final long createTime;
    private final StickerPackCreator creator;
    private final int id;
    private final String name;
    private final List<StickerItem> stickerItems;
    private final long updateTime;
    private final int userCount;
    private final String uuid;

    public static /* synthetic */ StickerPackDetail copy$default(StickerPackDetail stickerPackDetail, int i, String str, String str2, long j, int i2, String str3, long j2, List list, StickerPackCreator stickerPackCreator, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = stickerPackDetail.id;
        }
        if ((i3 & 2) != 0) {
            str = stickerPackDetail.name;
        }
        if ((i3 & 4) != 0) {
            str2 = stickerPackDetail.createBy;
        }
        if ((i3 & 8) != 0) {
            j = stickerPackDetail.createTime;
        }
        if ((i3 & 16) != 0) {
            i2 = stickerPackDetail.userCount;
        }
        if ((i3 & 32) != 0) {
            str3 = stickerPackDetail.uuid;
        }
        if ((i3 & 64) != 0) {
            j2 = stickerPackDetail.updateTime;
        }
        if ((i3 & 128) != 0) {
            list = stickerPackDetail.stickerItems;
        }
        if ((i3 & 256) != 0) {
            stickerPackCreator = stickerPackDetail.creator;
        }
        long j3 = j2;
        int i4 = i2;
        long j4 = j;
        String str4 = str2;
        return stickerPackDetail.copy(i, str, str4, j4, i4, str3, j3, list, stickerPackCreator);
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
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getUserCount() {
        return this.userCount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component7, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final List<StickerItem> component8() {
        return this.stickerItems;
    }

    /* renamed from: component9, reason: from getter */
    public final StickerPackCreator getCreator() {
        return this.creator;
    }

    public final StickerPackDetail copy(int id, String name, String createBy, long createTime, int userCount, String uuid, long updateTime, List<StickerItem> stickerItems, StickerPackCreator creator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(stickerItems, "stickerItems");
        Intrinsics.checkNotNullParameter(creator, "creator");
        return new StickerPackDetail(id, name, createBy, createTime, userCount, uuid, updateTime, stickerItems, creator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerPackDetail)) {
            return false;
        }
        StickerPackDetail stickerPackDetail = (StickerPackDetail) other;
        return this.id == stickerPackDetail.id && Intrinsics.areEqual(this.name, stickerPackDetail.name) && Intrinsics.areEqual(this.createBy, stickerPackDetail.createBy) && this.createTime == stickerPackDetail.createTime && this.userCount == stickerPackDetail.userCount && Intrinsics.areEqual(this.uuid, stickerPackDetail.uuid) && this.updateTime == stickerPackDetail.updateTime && Intrinsics.areEqual(this.stickerItems, stickerPackDetail.stickerItems) && Intrinsics.areEqual(this.creator, stickerPackDetail.creator);
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.userCount)) * 31) + this.uuid.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + this.stickerItems.hashCode()) * 31) + this.creator.hashCode();
    }

    public String toString() {
        return "StickerPackDetail(id=" + this.id + ", name=" + this.name + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", userCount=" + this.userCount + ", uuid=" + this.uuid + ", updateTime=" + this.updateTime + ", stickerItems=" + this.stickerItems + ", creator=" + this.creator + ")";
    }

    public StickerPackDetail(int id, String name, String createBy, long createTime, int userCount, String uuid, long updateTime, List<StickerItem> stickerItems, StickerPackCreator creator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(stickerItems, "stickerItems");
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.id = id;
        this.name = name;
        this.createBy = createBy;
        this.createTime = createTime;
        this.userCount = userCount;
        this.uuid = uuid;
        this.updateTime = updateTime;
        this.stickerItems = stickerItems;
        this.creator = creator;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final List<StickerItem> getStickerItems() {
        return this.stickerItems;
    }

    public final StickerPackCreator getCreator() {
        return this.creator;
    }
}
