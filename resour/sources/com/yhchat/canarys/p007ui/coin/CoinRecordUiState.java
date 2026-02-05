package com.yhchat.canarys.p007ui.coin;

import com.yhchat.canarys.data.model.GoldCoinRecord;
import com.yhchat.canarys.data.model.RewardRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinRecordActivity.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00c6\u0003Jl\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010'\u001a\u00020\u0007H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019\u00a8\u0006)"}, m169d2 = {"Lcom/yhchat/canarys/ui/coin/CoinRecordUiState;", "", "isLoading", "", "error", "", "loadingPage", "", "errorPage", "coinRecords", "", "Lcom/yhchat/canarys/data/model/GoldCoinRecord;", "postRewards", "Lcom/yhchat/canarys/data/model/RewardRecord;", "commentRewards", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()Z", "getError", "()Ljava/lang/String;", "getLoadingPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorPage", "getCoinRecords", "()Ljava/util/List;", "getPostRewards", "getCommentRewards", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/yhchat/canarys/ui/coin/CoinRecordUiState;", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CoinRecordUiState {
    public static final int $stable = 8;
    private final List<GoldCoinRecord> coinRecords;
    private final List<RewardRecord> commentRewards;
    private final String error;
    private final Integer errorPage;
    private final boolean isLoading;
    private final Integer loadingPage;
    private final List<RewardRecord> postRewards;

    public CoinRecordUiState() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CoinRecordUiState copy$default(CoinRecordUiState coinRecordUiState, boolean z, String str, Integer num, Integer num2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = coinRecordUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = coinRecordUiState.error;
        }
        if ((i & 4) != 0) {
            num = coinRecordUiState.loadingPage;
        }
        if ((i & 8) != 0) {
            num2 = coinRecordUiState.errorPage;
        }
        if ((i & 16) != 0) {
            list = coinRecordUiState.coinRecords;
        }
        if ((i & 32) != 0) {
            list2 = coinRecordUiState.postRewards;
        }
        if ((i & 64) != 0) {
            list3 = coinRecordUiState.commentRewards;
        }
        List list4 = list2;
        List list5 = list3;
        List list6 = list;
        Integer num3 = num;
        return coinRecordUiState.copy(z, str, num3, num2, list6, list4, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getLoadingPage() {
        return this.loadingPage;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getErrorPage() {
        return this.errorPage;
    }

    public final List<GoldCoinRecord> component5() {
        return this.coinRecords;
    }

    public final List<RewardRecord> component6() {
        return this.postRewards;
    }

    public final List<RewardRecord> component7() {
        return this.commentRewards;
    }

    public final CoinRecordUiState copy(boolean isLoading, String error, Integer loadingPage, Integer errorPage, List<GoldCoinRecord> coinRecords, List<RewardRecord> postRewards, List<RewardRecord> commentRewards) {
        Intrinsics.checkNotNullParameter(coinRecords, "coinRecords");
        Intrinsics.checkNotNullParameter(postRewards, "postRewards");
        Intrinsics.checkNotNullParameter(commentRewards, "commentRewards");
        return new CoinRecordUiState(isLoading, error, loadingPage, errorPage, coinRecords, postRewards, commentRewards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoinRecordUiState)) {
            return false;
        }
        CoinRecordUiState coinRecordUiState = (CoinRecordUiState) other;
        return this.isLoading == coinRecordUiState.isLoading && Intrinsics.areEqual(this.error, coinRecordUiState.error) && Intrinsics.areEqual(this.loadingPage, coinRecordUiState.loadingPage) && Intrinsics.areEqual(this.errorPage, coinRecordUiState.errorPage) && Intrinsics.areEqual(this.coinRecords, coinRecordUiState.coinRecords) && Intrinsics.areEqual(this.postRewards, coinRecordUiState.postRewards) && Intrinsics.areEqual(this.commentRewards, coinRecordUiState.commentRewards);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.loadingPage == null ? 0 : this.loadingPage.hashCode())) * 31) + (this.errorPage != null ? this.errorPage.hashCode() : 0)) * 31) + this.coinRecords.hashCode()) * 31) + this.postRewards.hashCode()) * 31) + this.commentRewards.hashCode();
    }

    public String toString() {
        return "CoinRecordUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", loadingPage=" + this.loadingPage + ", errorPage=" + this.errorPage + ", coinRecords=" + this.coinRecords + ", postRewards=" + this.postRewards + ", commentRewards=" + this.commentRewards + ")";
    }

    public CoinRecordUiState(boolean isLoading, String error, Integer loadingPage, Integer errorPage, List<GoldCoinRecord> coinRecords, List<RewardRecord> postRewards, List<RewardRecord> commentRewards) {
        Intrinsics.checkNotNullParameter(coinRecords, "coinRecords");
        Intrinsics.checkNotNullParameter(postRewards, "postRewards");
        Intrinsics.checkNotNullParameter(commentRewards, "commentRewards");
        this.isLoading = isLoading;
        this.error = error;
        this.loadingPage = loadingPage;
        this.errorPage = errorPage;
        this.coinRecords = coinRecords;
        this.postRewards = postRewards;
        this.commentRewards = commentRewards;
    }

    public /* synthetic */ CoinRecordUiState(boolean z, String str, Integer num, Integer num2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? CollectionsKt.emptyList() : list3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final Integer getLoadingPage() {
        return this.loadingPage;
    }

    public final Integer getErrorPage() {
        return this.errorPage;
    }

    public final List<GoldCoinRecord> getCoinRecords() {
        return this.coinRecords;
    }

    public final List<RewardRecord> getPostRewards() {
        return this.postRewards;
    }

    public final List<RewardRecord> getCommentRewards() {
        return this.commentRewards;
    }
}
