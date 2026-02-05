package com.yhchat.canarys.p007ui.chat;

import com.yhchat.canarys.data.model.ChatAddInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatAddViewModel.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ChatAddUiState;", "", "isLoading", "", "chatInfo", "Lcom/yhchat/canarys/data/model/ChatAddInfo;", "error", "", "isAdding", "isAddSuccess", "addError", "<init>", "(ZLcom/yhchat/canarys/data/model/ChatAddInfo;Ljava/lang/String;ZZLjava/lang/String;)V", "()Z", "getChatInfo", "()Lcom/yhchat/canarys/data/model/ChatAddInfo;", "getError", "()Ljava/lang/String;", "getAddError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChatAddUiState {
    public static final int $stable = 0;
    private final String addError;
    private final ChatAddInfo chatInfo;
    private final String error;
    private final boolean isAddSuccess;
    private final boolean isAdding;
    private final boolean isLoading;

    public ChatAddUiState() {
        this(false, null, null, false, false, null, 63, null);
    }

    public static /* synthetic */ ChatAddUiState copy$default(ChatAddUiState chatAddUiState, boolean z, ChatAddInfo chatAddInfo, String str, boolean z2, boolean z3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatAddUiState.isLoading;
        }
        if ((i & 2) != 0) {
            chatAddInfo = chatAddUiState.chatInfo;
        }
        if ((i & 4) != 0) {
            str = chatAddUiState.error;
        }
        if ((i & 8) != 0) {
            z2 = chatAddUiState.isAdding;
        }
        if ((i & 16) != 0) {
            z3 = chatAddUiState.isAddSuccess;
        }
        if ((i & 32) != 0) {
            str2 = chatAddUiState.addError;
        }
        boolean z4 = z3;
        String str3 = str2;
        return chatAddUiState.copy(z, chatAddInfo, str, z2, z4, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final ChatAddInfo getChatInfo() {
        return this.chatInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAdding() {
        return this.isAdding;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAddSuccess() {
        return this.isAddSuccess;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAddError() {
        return this.addError;
    }

    public final ChatAddUiState copy(boolean isLoading, ChatAddInfo chatInfo, String error, boolean isAdding, boolean isAddSuccess, String addError) {
        return new ChatAddUiState(isLoading, chatInfo, error, isAdding, isAddSuccess, addError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatAddUiState)) {
            return false;
        }
        ChatAddUiState chatAddUiState = (ChatAddUiState) other;
        return this.isLoading == chatAddUiState.isLoading && Intrinsics.areEqual(this.chatInfo, chatAddUiState.chatInfo) && Intrinsics.areEqual(this.error, chatAddUiState.error) && this.isAdding == chatAddUiState.isAdding && this.isAddSuccess == chatAddUiState.isAddSuccess && Intrinsics.areEqual(this.addError, chatAddUiState.addError);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + (this.chatInfo == null ? 0 : this.chatInfo.hashCode())) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isAdding)) * 31) + Boolean.hashCode(this.isAddSuccess)) * 31) + (this.addError != null ? this.addError.hashCode() : 0);
    }

    public String toString() {
        return "ChatAddUiState(isLoading=" + this.isLoading + ", chatInfo=" + this.chatInfo + ", error=" + this.error + ", isAdding=" + this.isAdding + ", isAddSuccess=" + this.isAddSuccess + ", addError=" + this.addError + ")";
    }

    public ChatAddUiState(boolean isLoading, ChatAddInfo chatInfo, String error, boolean isAdding, boolean isAddSuccess, String addError) {
        this.isLoading = isLoading;
        this.chatInfo = chatInfo;
        this.error = error;
        this.isAdding = isAdding;
        this.isAddSuccess = isAddSuccess;
        this.addError = addError;
    }

    public /* synthetic */ ChatAddUiState(boolean z, ChatAddInfo chatAddInfo, String str, boolean z2, boolean z3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : chatAddInfo, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ChatAddInfo getChatInfo() {
        return this.chatInfo;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean isAdding() {
        return this.isAdding;
    }

    public final boolean isAddSuccess() {
        return this.isAddSuccess;
    }

    public final String getAddError() {
        return this.addError;
    }
}
