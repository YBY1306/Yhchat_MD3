package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.p007ui.contacts.Contact;
import com.yhchat.canarys.proto.group.Bot_data;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupBotManagementActivity.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u00c6\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupBotManagementUiState;", "", "isLoading", "", "bots", "", "Lcom/yhchat/canarys/proto/group/Bot_data;", "myBots", "Lcom/yhchat/canarys/ui/contacts/Contact;", "error", "", "operationSuccess", "operationError", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "()Z", "getBots", "()Ljava/util/List;", "getMyBots", "getError", "()Ljava/lang/String;", "getOperationSuccess", "getOperationError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GroupBotManagementUiState {
    public static final int $stable = 8;
    private final List<Bot_data> bots;
    private final String error;
    private final boolean isLoading;
    private final List<Contact> myBots;
    private final String operationError;
    private final boolean operationSuccess;

    public GroupBotManagementUiState() {
        this(false, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ GroupBotManagementUiState copy$default(GroupBotManagementUiState groupBotManagementUiState, boolean z, List list, List list2, String str, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = groupBotManagementUiState.isLoading;
        }
        if ((i & 2) != 0) {
            list = groupBotManagementUiState.bots;
        }
        if ((i & 4) != 0) {
            list2 = groupBotManagementUiState.myBots;
        }
        if ((i & 8) != 0) {
            str = groupBotManagementUiState.error;
        }
        if ((i & 16) != 0) {
            z2 = groupBotManagementUiState.operationSuccess;
        }
        if ((i & 32) != 0) {
            str2 = groupBotManagementUiState.operationError;
        }
        boolean z3 = z2;
        String str3 = str2;
        return groupBotManagementUiState.copy(z, list, list2, str, z3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<Bot_data> component2() {
        return this.bots;
    }

    public final List<Contact> component3() {
        return this.myBots;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOperationSuccess() {
        return this.operationSuccess;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOperationError() {
        return this.operationError;
    }

    public final GroupBotManagementUiState copy(boolean isLoading, List<Bot_data> bots, List<Contact> myBots, String error, boolean operationSuccess, String operationError) {
        Intrinsics.checkNotNullParameter(bots, "bots");
        Intrinsics.checkNotNullParameter(myBots, "myBots");
        return new GroupBotManagementUiState(isLoading, bots, myBots, error, operationSuccess, operationError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupBotManagementUiState)) {
            return false;
        }
        GroupBotManagementUiState groupBotManagementUiState = (GroupBotManagementUiState) other;
        return this.isLoading == groupBotManagementUiState.isLoading && Intrinsics.areEqual(this.bots, groupBotManagementUiState.bots) && Intrinsics.areEqual(this.myBots, groupBotManagementUiState.myBots) && Intrinsics.areEqual(this.error, groupBotManagementUiState.error) && this.operationSuccess == groupBotManagementUiState.operationSuccess && Intrinsics.areEqual(this.operationError, groupBotManagementUiState.operationError);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + this.bots.hashCode()) * 31) + this.myBots.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.operationSuccess)) * 31) + (this.operationError != null ? this.operationError.hashCode() : 0);
    }

    public String toString() {
        return "GroupBotManagementUiState(isLoading=" + this.isLoading + ", bots=" + this.bots + ", myBots=" + this.myBots + ", error=" + this.error + ", operationSuccess=" + this.operationSuccess + ", operationError=" + this.operationError + ")";
    }

    public GroupBotManagementUiState(boolean isLoading, List<Bot_data> bots, List<Contact> myBots, String error, boolean operationSuccess, String operationError) {
        Intrinsics.checkNotNullParameter(bots, "bots");
        Intrinsics.checkNotNullParameter(myBots, "myBots");
        this.isLoading = isLoading;
        this.bots = bots;
        this.myBots = myBots;
        this.error = error;
        this.operationSuccess = operationSuccess;
        this.operationError = operationError;
    }

    public /* synthetic */ GroupBotManagementUiState(boolean z, List list, List list2, String str, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<Bot_data> getBots() {
        return this.bots;
    }

    public final List<Contact> getMyBots() {
        return this.myBots;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getOperationSuccess() {
        return this.operationSuccess;
    }

    public final String getOperationError() {
        return this.operationError;
    }
}
