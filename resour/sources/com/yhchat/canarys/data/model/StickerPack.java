package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Sticker.kt */
@Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\tH\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J}\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\tH\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00064"}, m169d2 = {"Lcom/yhchat/canarys/data/model/StickerPack;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "createBy", "createTime", "delFlag", "", "userCount", "hot", "uuid", "updateTime", "sort", "stickerItems", "", "Lcom/yhchat/canarys/data/model/StickerItem;", "<init>", "(JLjava/lang/String;Ljava/lang/String;JIIILjava/lang/String;JILjava/util/List;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getCreateBy", "getCreateTime", "getDelFlag", "()I", "getUserCount", "getHot", "getUuid", "getUpdateTime", "getSort", "getStickerItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StickerPack {
    public static final int $stable = 8;

    @SerializedName("createBy")
    private final String createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName("hot")
    private final int hot;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("sort")
    private final int sort;

    @SerializedName("stickerItems")
    private final List<StickerItem> stickerItems;

    @SerializedName("updateTime")
    private final long updateTime;

    @SerializedName("userCount")
    private final int userCount;

    @SerializedName("uuid")
    private final String uuid;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final List<StickerItem> component11() {
        return this.stickerItems;
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
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component6, reason: from getter */
    public final int getUserCount() {
        return this.userCount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHot() {
        return this.hot;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component9, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final StickerPack copy(long j, String str, String createBy, long createTime, int delFlag, int userCount, int hot, String uuid, long updateTime, int sort, List<StickerItem> stickerItems) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(stickerItems, "stickerItems");
        return new StickerPack(j, str, createBy, createTime, delFlag, userCount, hot, uuid, updateTime, sort, stickerItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerPack)) {
            return false;
        }
        StickerPack stickerPack = (StickerPack) other;
        return this.id == stickerPack.id && Intrinsics.areEqual(this.name, stickerPack.name) && Intrinsics.areEqual(this.createBy, stickerPack.createBy) && this.createTime == stickerPack.createTime && this.delFlag == stickerPack.delFlag && this.userCount == stickerPack.userCount && this.hot == stickerPack.hot && Intrinsics.areEqual(this.uuid, stickerPack.uuid) && this.updateTime == stickerPack.updateTime && this.sort == stickerPack.sort && Intrinsics.areEqual(this.stickerItems, stickerPack.stickerItems);
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.delFlag)) * 31) + Integer.hashCode(this.userCount)) * 31) + Integer.hashCode(this.hot)) * 31) + this.uuid.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.sort)) * 31) + this.stickerItems.hashCode();
    }

    public String toString() {
        return "StickerPack(id=" + this.id + ", name=" + this.name + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", delFlag=" + this.delFlag + ", userCount=" + this.userCount + ", hot=" + this.hot + ", uuid=" + this.uuid + ", updateTime=" + this.updateTime + ", sort=" + this.sort + ", stickerItems=" + this.stickerItems + ")";
    }

    public StickerPack(long id, String name, String createBy, long createTime, int delFlag, int userCount, int hot, String uuid, long updateTime, int sort, List<StickerItem> stickerItems) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(stickerItems, "stickerItems");
        this.id = id;
        this.name = name;
        this.createBy = createBy;
        this.createTime = createTime;
        this.delFlag = delFlag;
        this.userCount = userCount;
        this.hot = hot;
        this.uuid = uuid;
        this.updateTime = updateTime;
        this.sort = sort;
        this.stickerItems = stickerItems;
    }

    public /* synthetic */ StickerPack(long j, String str, String str2, long j2, int i, int i2, int i3, String str3, long j3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, j2, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? "" : str3, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? 0 : i4, (i5 & 1024) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final long getId() {
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

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final int getHot() {
        return this.hot;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getSort() {
        return this.sort;
    }

    public final List<StickerItem> getStickerItems() {
        return this.stickerItems;
    }
}
