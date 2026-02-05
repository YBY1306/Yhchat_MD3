package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/FollowingBoardListData;", "", "boards", "", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "total", "", "<init>", "(Ljava/util/List;I)V", "getBoards", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FollowingBoardListData {
    public static final int $stable = 8;

    @SerializedName("ba")
    private final List<CommunityBoard> boards;

    @SerializedName("total")
    private final int total;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowingBoardListData copy$default(FollowingBoardListData followingBoardListData, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = followingBoardListData.boards;
        }
        if ((i2 & 2) != 0) {
            i = followingBoardListData.total;
        }
        return followingBoardListData.copy(list, i);
    }

    public final List<CommunityBoard> component1() {
        return this.boards;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final FollowingBoardListData copy(List<CommunityBoard> boards, int total) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        return new FollowingBoardListData(boards, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowingBoardListData)) {
            return false;
        }
        FollowingBoardListData followingBoardListData = (FollowingBoardListData) other;
        return Intrinsics.areEqual(this.boards, followingBoardListData.boards) && this.total == followingBoardListData.total;
    }

    public int hashCode() {
        return (this.boards.hashCode() * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "FollowingBoardListData(boards=" + this.boards + ", total=" + this.total + ")";
    }

    public FollowingBoardListData(List<CommunityBoard> boards, int total) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        this.boards = boards;
        this.total = total;
    }

    public final List<CommunityBoard> getBoards() {
        return this.boards;
    }

    public final int getTotal() {
        return this.total;
    }
}
