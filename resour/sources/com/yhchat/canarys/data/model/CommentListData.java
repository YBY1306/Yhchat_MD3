package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CommentListData;", "", "comments", "", "Lcom/yhchat/canarys/data/model/CommunityComment;", "isAdmin", "", "total", "<init>", "(Ljava/util/List;II)V", "getComments", "()Ljava/util/List;", "()I", "getTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CommentListData {
    public static final int $stable = 8;

    @SerializedName("comments")
    private final List<CommunityComment> comments;

    @SerializedName("isAdmin")
    private final int isAdmin;

    @SerializedName("total")
    private final int total;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentListData copy$default(CommentListData commentListData, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = commentListData.comments;
        }
        if ((i3 & 2) != 0) {
            i = commentListData.isAdmin;
        }
        if ((i3 & 4) != 0) {
            i2 = commentListData.total;
        }
        return commentListData.copy(list, i, i2);
    }

    public final List<CommunityComment> component1() {
        return this.comments;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIsAdmin() {
        return this.isAdmin;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final CommentListData copy(List<CommunityComment> comments, int isAdmin, int total) {
        Intrinsics.checkNotNullParameter(comments, "comments");
        return new CommentListData(comments, isAdmin, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentListData)) {
            return false;
        }
        CommentListData commentListData = (CommentListData) other;
        return Intrinsics.areEqual(this.comments, commentListData.comments) && this.isAdmin == commentListData.isAdmin && this.total == commentListData.total;
    }

    public int hashCode() {
        return (((this.comments.hashCode() * 31) + Integer.hashCode(this.isAdmin)) * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "CommentListData(comments=" + this.comments + ", isAdmin=" + this.isAdmin + ", total=" + this.total + ")";
    }

    public CommentListData(List<CommunityComment> comments, int isAdmin, int total) {
        Intrinsics.checkNotNullParameter(comments, "comments");
        this.comments = comments;
        this.isAdmin = isAdmin;
        this.total = total;
    }

    public final List<CommunityComment> getComments() {
        return this.comments;
    }

    public final int isAdmin() {
        return this.isAdmin;
    }

    public final int getTotal() {
        return this.total;
    }
}
