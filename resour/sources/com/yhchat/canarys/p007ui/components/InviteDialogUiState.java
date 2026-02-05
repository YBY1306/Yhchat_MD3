package com.yhchat.canarys.p007ui.components;

import com.yhchat.canarys.p007ui.contacts.Contact;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InviteToGroupDialog.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/InviteDialogUiState;", "", "isLoading", "", "friends", "", "Lcom/yhchat/canarys/ui/contacts/Contact;", "invitingFriendId", "", "error", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getFriends", "()Ljava/util/List;", "getInvitingFriendId", "()Ljava/lang/String;", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InviteDialogUiState {
    public static final int $stable = 8;
    private final String error;
    private final List<Contact> friends;
    private final String invitingFriendId;
    private final boolean isLoading;

    public InviteDialogUiState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InviteDialogUiState copy$default(InviteDialogUiState inviteDialogUiState, boolean z, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inviteDialogUiState.isLoading;
        }
        if ((i & 2) != 0) {
            list = inviteDialogUiState.friends;
        }
        if ((i & 4) != 0) {
            str = inviteDialogUiState.invitingFriendId;
        }
        if ((i & 8) != 0) {
            str2 = inviteDialogUiState.error;
        }
        return inviteDialogUiState.copy(z, list, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<Contact> component2() {
        return this.friends;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInvitingFriendId() {
        return this.invitingFriendId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final InviteDialogUiState copy(boolean isLoading, List<Contact> friends, String invitingFriendId, String error) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        return new InviteDialogUiState(isLoading, friends, invitingFriendId, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteDialogUiState)) {
            return false;
        }
        InviteDialogUiState inviteDialogUiState = (InviteDialogUiState) other;
        return this.isLoading == inviteDialogUiState.isLoading && Intrinsics.areEqual(this.friends, inviteDialogUiState.friends) && Intrinsics.areEqual(this.invitingFriendId, inviteDialogUiState.invitingFriendId) && Intrinsics.areEqual(this.error, inviteDialogUiState.error);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + this.friends.hashCode()) * 31) + (this.invitingFriendId == null ? 0 : this.invitingFriendId.hashCode())) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "InviteDialogUiState(isLoading=" + this.isLoading + ", friends=" + this.friends + ", invitingFriendId=" + this.invitingFriendId + ", error=" + this.error + ")";
    }

    public InviteDialogUiState(boolean isLoading, List<Contact> friends, String invitingFriendId, String error) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        this.isLoading = isLoading;
        this.friends = friends;
        this.invitingFriendId = invitingFriendId;
        this.error = error;
    }

    public /* synthetic */ InviteDialogUiState(boolean z, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<Contact> getFriends() {
        return this.friends;
    }

    public final String getInvitingFriendId() {
        return this.invitingFriendId;
    }

    public final String getError() {
        return this.error;
    }
}
