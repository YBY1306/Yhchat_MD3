package com.yhchat.canarys.p007ui.search;

import com.yhchat.canarys.data.model.BotInfo;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.UserInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComprehensiveSearchViewModel.kt */
@Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003Jk\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/ui/search/ComprehensiveSearchUiState;", "", "isLoading", "", "isAdding", "error", "", "groupResult", "Lcom/yhchat/canarys/data/model/GroupDetail;", "userResult", "Lcom/yhchat/canarys/data/model/UserInfo;", "botResult", "Lcom/yhchat/canarys/data/model/BotInfo;", "showGroupDialog", "showUserDialog", "showBotDialog", "<init>", "(ZZLjava/lang/String;Lcom/yhchat/canarys/data/model/GroupDetail;Lcom/yhchat/canarys/data/model/UserInfo;Lcom/yhchat/canarys/data/model/BotInfo;ZZZ)V", "()Z", "getError", "()Ljava/lang/String;", "getGroupResult", "()Lcom/yhchat/canarys/data/model/GroupDetail;", "getUserResult", "()Lcom/yhchat/canarys/data/model/UserInfo;", "getBotResult", "()Lcom/yhchat/canarys/data/model/BotInfo;", "getShowGroupDialog", "getShowUserDialog", "getShowBotDialog", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComprehensiveSearchUiState {
    public static final int $stable = 8;
    private final BotInfo botResult;
    private final String error;
    private final GroupDetail groupResult;
    private final boolean isAdding;
    private final boolean isLoading;
    private final boolean showBotDialog;
    private final boolean showGroupDialog;
    private final boolean showUserDialog;
    private final UserInfo userResult;

    public ComprehensiveSearchUiState() {
        this(false, false, null, null, null, null, false, false, false, 511, null);
    }

    public static /* synthetic */ ComprehensiveSearchUiState copy$default(ComprehensiveSearchUiState comprehensiveSearchUiState, boolean z, boolean z2, String str, GroupDetail groupDetail, UserInfo userInfo, BotInfo botInfo, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = comprehensiveSearchUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = comprehensiveSearchUiState.isAdding;
        }
        if ((i & 4) != 0) {
            str = comprehensiveSearchUiState.error;
        }
        if ((i & 8) != 0) {
            groupDetail = comprehensiveSearchUiState.groupResult;
        }
        if ((i & 16) != 0) {
            userInfo = comprehensiveSearchUiState.userResult;
        }
        if ((i & 32) != 0) {
            botInfo = comprehensiveSearchUiState.botResult;
        }
        if ((i & 64) != 0) {
            z3 = comprehensiveSearchUiState.showGroupDialog;
        }
        if ((i & 128) != 0) {
            z4 = comprehensiveSearchUiState.showUserDialog;
        }
        if ((i & 256) != 0) {
            z5 = comprehensiveSearchUiState.showBotDialog;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        BotInfo botInfo2 = botInfo;
        boolean z8 = z3;
        UserInfo userInfo2 = userInfo;
        String str2 = str;
        return comprehensiveSearchUiState.copy(z, z2, str2, groupDetail, userInfo2, botInfo2, z8, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAdding() {
        return this.isAdding;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final GroupDetail getGroupResult() {
        return this.groupResult;
    }

    /* renamed from: component5, reason: from getter */
    public final UserInfo getUserResult() {
        return this.userResult;
    }

    /* renamed from: component6, reason: from getter */
    public final BotInfo getBotResult() {
        return this.botResult;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowGroupDialog() {
        return this.showGroupDialog;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowUserDialog() {
        return this.showUserDialog;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowBotDialog() {
        return this.showBotDialog;
    }

    public final ComprehensiveSearchUiState copy(boolean isLoading, boolean isAdding, String error, GroupDetail groupResult, UserInfo userResult, BotInfo botResult, boolean showGroupDialog, boolean showUserDialog, boolean showBotDialog) {
        return new ComprehensiveSearchUiState(isLoading, isAdding, error, groupResult, userResult, botResult, showGroupDialog, showUserDialog, showBotDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComprehensiveSearchUiState)) {
            return false;
        }
        ComprehensiveSearchUiState comprehensiveSearchUiState = (ComprehensiveSearchUiState) other;
        return this.isLoading == comprehensiveSearchUiState.isLoading && this.isAdding == comprehensiveSearchUiState.isAdding && Intrinsics.areEqual(this.error, comprehensiveSearchUiState.error) && Intrinsics.areEqual(this.groupResult, comprehensiveSearchUiState.groupResult) && Intrinsics.areEqual(this.userResult, comprehensiveSearchUiState.userResult) && Intrinsics.areEqual(this.botResult, comprehensiveSearchUiState.botResult) && this.showGroupDialog == comprehensiveSearchUiState.showGroupDialog && this.showUserDialog == comprehensiveSearchUiState.showUserDialog && this.showBotDialog == comprehensiveSearchUiState.showBotDialog;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isAdding)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.groupResult == null ? 0 : this.groupResult.hashCode())) * 31) + (this.userResult == null ? 0 : this.userResult.hashCode())) * 31) + (this.botResult != null ? this.botResult.hashCode() : 0)) * 31) + Boolean.hashCode(this.showGroupDialog)) * 31) + Boolean.hashCode(this.showUserDialog)) * 31) + Boolean.hashCode(this.showBotDialog);
    }

    public String toString() {
        return "ComprehensiveSearchUiState(isLoading=" + this.isLoading + ", isAdding=" + this.isAdding + ", error=" + this.error + ", groupResult=" + this.groupResult + ", userResult=" + this.userResult + ", botResult=" + this.botResult + ", showGroupDialog=" + this.showGroupDialog + ", showUserDialog=" + this.showUserDialog + ", showBotDialog=" + this.showBotDialog + ")";
    }

    public ComprehensiveSearchUiState(boolean isLoading, boolean isAdding, String error, GroupDetail groupResult, UserInfo userResult, BotInfo botResult, boolean showGroupDialog, boolean showUserDialog, boolean showBotDialog) {
        this.isLoading = isLoading;
        this.isAdding = isAdding;
        this.error = error;
        this.groupResult = groupResult;
        this.userResult = userResult;
        this.botResult = botResult;
        this.showGroupDialog = showGroupDialog;
        this.showUserDialog = showUserDialog;
        this.showBotDialog = showBotDialog;
    }

    public /* synthetic */ ComprehensiveSearchUiState(boolean z, boolean z2, String str, GroupDetail groupDetail, UserInfo userInfo, BotInfo botInfo, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : groupDetail, (i & 16) != 0 ? null : userInfo, (i & 32) != 0 ? null : botInfo, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isAdding() {
        return this.isAdding;
    }

    public final String getError() {
        return this.error;
    }

    public final GroupDetail getGroupResult() {
        return this.groupResult;
    }

    public final UserInfo getUserResult() {
        return this.userResult;
    }

    public final BotInfo getBotResult() {
        return this.botResult;
    }

    public final boolean getShowGroupDialog() {
        return this.showGroupDialog;
    }

    public final boolean getShowUserDialog() {
        return this.showUserDialog;
    }

    public final boolean getShowBotDialog() {
        return this.showBotDialog;
    }
}
