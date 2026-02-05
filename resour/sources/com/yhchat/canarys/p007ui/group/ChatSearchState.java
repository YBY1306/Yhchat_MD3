package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.model.ChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatSearchViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\rH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\rH\u00d6\u0001J\t\u0010/\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/ChatSearchState;", "", "isLoading", "", "searchResults", "", "Lcom/yhchat/canarys/data/model/ChatMessage;", "error", "", "searchQuery", "isLoadingMore", "hasMoreResults", "currentPage", "", "selectedMessage", "isLoadingMessageDetail", "lastTimestamp", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZILcom/yhchat/canarys/data/model/ChatMessage;ZJ)V", "()Z", "getSearchResults", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "getSearchQuery", "getHasMoreResults", "getCurrentPage", "()I", "getSelectedMessage", "()Lcom/yhchat/canarys/data/model/ChatMessage;", "getLastTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChatSearchState {
    public static final int $stable = 8;
    private final int currentPage;
    private final String error;
    private final boolean hasMoreResults;
    private final boolean isLoading;
    private final boolean isLoadingMessageDetail;
    private final boolean isLoadingMore;
    private final long lastTimestamp;
    private final String searchQuery;
    private final List<ChatMessage> searchResults;
    private final ChatMessage selectedMessage;

    public ChatSearchState() {
        this(false, null, null, null, false, false, 0, null, false, 0L, 1023, null);
    }

    public static /* synthetic */ ChatSearchState copy$default(ChatSearchState chatSearchState, boolean z, List list, String str, String str2, boolean z2, boolean z3, int i, ChatMessage chatMessage, boolean z4, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = chatSearchState.isLoading;
        }
        if ((i2 & 2) != 0) {
            list = chatSearchState.searchResults;
        }
        if ((i2 & 4) != 0) {
            str = chatSearchState.error;
        }
        if ((i2 & 8) != 0) {
            str2 = chatSearchState.searchQuery;
        }
        if ((i2 & 16) != 0) {
            z2 = chatSearchState.isLoadingMore;
        }
        if ((i2 & 32) != 0) {
            z3 = chatSearchState.hasMoreResults;
        }
        if ((i2 & 64) != 0) {
            i = chatSearchState.currentPage;
        }
        if ((i2 & 128) != 0) {
            chatMessage = chatSearchState.selectedMessage;
        }
        if ((i2 & 256) != 0) {
            z4 = chatSearchState.isLoadingMessageDetail;
        }
        if ((i2 & 512) != 0) {
            j = chatSearchState.lastTimestamp;
        }
        long j2 = j;
        ChatMessage chatMessage2 = chatMessage;
        boolean z5 = z4;
        boolean z6 = z3;
        int i3 = i;
        boolean z7 = z2;
        String str3 = str;
        return chatSearchState.copy(z, list, str3, str2, z7, z6, i3, chatMessage2, z5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public final List<ChatMessage> component2() {
        return this.searchResults;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasMoreResults() {
        return this.hasMoreResults;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component8, reason: from getter */
    public final ChatMessage getSelectedMessage() {
        return this.selectedMessage;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoadingMessageDetail() {
        return this.isLoadingMessageDetail;
    }

    public final ChatSearchState copy(boolean isLoading, List<ChatMessage> searchResults, String error, String searchQuery, boolean isLoadingMore, boolean hasMoreResults, int currentPage, ChatMessage selectedMessage, boolean isLoadingMessageDetail, long lastTimestamp) {
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new ChatSearchState(isLoading, searchResults, error, searchQuery, isLoadingMore, hasMoreResults, currentPage, selectedMessage, isLoadingMessageDetail, lastTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSearchState)) {
            return false;
        }
        ChatSearchState chatSearchState = (ChatSearchState) other;
        return this.isLoading == chatSearchState.isLoading && Intrinsics.areEqual(this.searchResults, chatSearchState.searchResults) && Intrinsics.areEqual(this.error, chatSearchState.error) && Intrinsics.areEqual(this.searchQuery, chatSearchState.searchQuery) && this.isLoadingMore == chatSearchState.isLoadingMore && this.hasMoreResults == chatSearchState.hasMoreResults && this.currentPage == chatSearchState.currentPage && Intrinsics.areEqual(this.selectedMessage, chatSearchState.selectedMessage) && this.isLoadingMessageDetail == chatSearchState.isLoadingMessageDetail && this.lastTimestamp == chatSearchState.lastTimestamp;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.isLoading) * 31) + this.searchResults.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + this.searchQuery.hashCode()) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + Boolean.hashCode(this.hasMoreResults)) * 31) + Integer.hashCode(this.currentPage)) * 31) + (this.selectedMessage != null ? this.selectedMessage.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoadingMessageDetail)) * 31) + Long.hashCode(this.lastTimestamp);
    }

    public String toString() {
        return "ChatSearchState(isLoading=" + this.isLoading + ", searchResults=" + this.searchResults + ", error=" + this.error + ", searchQuery=" + this.searchQuery + ", isLoadingMore=" + this.isLoadingMore + ", hasMoreResults=" + this.hasMoreResults + ", currentPage=" + this.currentPage + ", selectedMessage=" + this.selectedMessage + ", isLoadingMessageDetail=" + this.isLoadingMessageDetail + ", lastTimestamp=" + this.lastTimestamp + ")";
    }

    public ChatSearchState(boolean isLoading, List<ChatMessage> searchResults, String error, String searchQuery, boolean isLoadingMore, boolean hasMoreResults, int currentPage, ChatMessage selectedMessage, boolean isLoadingMessageDetail, long lastTimestamp) {
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.isLoading = isLoading;
        this.searchResults = searchResults;
        this.error = error;
        this.searchQuery = searchQuery;
        this.isLoadingMore = isLoadingMore;
        this.hasMoreResults = hasMoreResults;
        this.currentPage = currentPage;
        this.selectedMessage = selectedMessage;
        this.isLoadingMessageDetail = isLoadingMessageDetail;
        this.lastTimestamp = lastTimestamp;
    }

    public /* synthetic */ ChatSearchState(boolean z, List list, String str, String str2, boolean z2, boolean z3, int i, ChatMessage chatMessage, boolean z4, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : chatMessage, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? 9999999999999L : j);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<ChatMessage> getSearchResults() {
        return this.searchResults;
    }

    public final String getError() {
        return this.error;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean getHasMoreResults() {
        return this.hasMoreResults;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final ChatMessage getSelectedMessage() {
        return this.selectedMessage;
    }

    public final boolean isLoadingMessageDetail() {
        return this.isLoadingMessageDetail;
    }

    public final long getLastTimestamp() {
        return this.lastTimestamp;
    }
}
