package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityBoard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/BoardDetailState;", "", "board", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "isLoading", "", "error", "", "<init>", "(Lcom/yhchat/canarys/data/model/CommunityBoard;ZLjava/lang/String;)V", "getBoard", "()Lcom/yhchat/canarys/data/model/CommunityBoard;", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BoardDetailState {
    public static final int $stable = 0;
    private final CommunityBoard board;
    private final String error;
    private final boolean isLoading;

    public BoardDetailState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ BoardDetailState copy$default(BoardDetailState boardDetailState, CommunityBoard communityBoard, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            communityBoard = boardDetailState.board;
        }
        if ((i & 2) != 0) {
            z = boardDetailState.isLoading;
        }
        if ((i & 4) != 0) {
            str = boardDetailState.error;
        }
        return boardDetailState.copy(communityBoard, z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CommunityBoard getBoard() {
        return this.board;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final BoardDetailState copy(CommunityBoard board, boolean isLoading, String error) {
        return new BoardDetailState(board, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardDetailState)) {
            return false;
        }
        BoardDetailState boardDetailState = (BoardDetailState) other;
        return Intrinsics.areEqual(this.board, boardDetailState.board) && this.isLoading == boardDetailState.isLoading && Intrinsics.areEqual(this.error, boardDetailState.error);
    }

    public int hashCode() {
        return ((((this.board == null ? 0 : this.board.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "BoardDetailState(board=" + this.board + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public BoardDetailState(CommunityBoard board, boolean isLoading, String error) {
        this.board = board;
        this.isLoading = isLoading;
        this.error = error;
    }

    public /* synthetic */ BoardDetailState(CommunityBoard communityBoard, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : communityBoard, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }

    public final CommunityBoard getBoard() {
        return this.board;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }
}
