package com.yhchat.canarys.p007ui.contacts;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsViewModel.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001B\u00d3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u000fH\u00c6\u0003J\t\u00108\u001a\u00020\u000fH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u00d5\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010B\u001a\u00020\u00032\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u000fH\u00d6\u0001J\t\u0010E\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001b\u00a8\u0006F"}, m169d2 = {"Lcom/yhchat/canarys/ui/contacts/ContactsUiState;", "", "isLoading", "", "error", "", "friends", "", "Lcom/yhchat/canarys/ui/contacts/Contact;", "groups", "bots", "myBots", "friendRequests", "Lcom/yhchat/canarys/ui/contacts/FriendRequestItem;", "friendRequestTotal", "", "friendRequestPending", "friendRequestsLoading", "friendRequestsExpanded", "selectedFriendRequest", "friendRequestProcessing", "friendsExpanded", "groupsExpanded", "botsExpanded", "myBotsExpanded", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIZZLcom/yhchat/canarys/ui/contacts/FriendRequestItem;ZZZZZ)V", "()Z", "getError", "()Ljava/lang/String;", "getFriends", "()Ljava/util/List;", "getGroups", "getBots", "getMyBots", "getFriendRequests", "getFriendRequestTotal", "()I", "getFriendRequestPending", "getFriendRequestsLoading", "getFriendRequestsExpanded", "getSelectedFriendRequest", "()Lcom/yhchat/canarys/ui/contacts/FriendRequestItem;", "getFriendRequestProcessing", "getFriendsExpanded", "getGroupsExpanded", "getBotsExpanded", "getMyBotsExpanded", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContactsUiState {
    public static final int $stable = 8;
    private final List<Contact> bots;
    private final boolean botsExpanded;
    private final String error;
    private final int friendRequestPending;
    private final boolean friendRequestProcessing;
    private final int friendRequestTotal;
    private final List<FriendRequestItem> friendRequests;
    private final boolean friendRequestsExpanded;
    private final boolean friendRequestsLoading;
    private final List<Contact> friends;
    private final boolean friendsExpanded;
    private final List<Contact> groups;
    private final boolean groupsExpanded;
    private final boolean isLoading;
    private final List<Contact> myBots;
    private final boolean myBotsExpanded;
    private final FriendRequestItem selectedFriendRequest;

    public ContactsUiState() {
        this(false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 131071, null);
    }

    public static /* synthetic */ ContactsUiState copy$default(ContactsUiState contactsUiState, boolean z, String str, List list, List list2, List list3, List list4, List list5, int i, int i2, boolean z2, boolean z3, FriendRequestItem friendRequestItem, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i3, Object obj) {
        boolean z9;
        boolean z10;
        boolean z11;
        ContactsUiState contactsUiState2;
        boolean z12;
        String str2;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        int i4;
        int i5;
        boolean z13;
        boolean z14;
        FriendRequestItem friendRequestItem2;
        boolean z15;
        boolean z16;
        boolean z17 = (i3 & 1) != 0 ? contactsUiState.isLoading : z;
        String str3 = (i3 & 2) != 0 ? contactsUiState.error : str;
        List list11 = (i3 & 4) != 0 ? contactsUiState.friends : list;
        List list12 = (i3 & 8) != 0 ? contactsUiState.groups : list2;
        List list13 = (i3 & 16) != 0 ? contactsUiState.bots : list3;
        List list14 = (i3 & 32) != 0 ? contactsUiState.myBots : list4;
        List list15 = (i3 & 64) != 0 ? contactsUiState.friendRequests : list5;
        int i6 = (i3 & 128) != 0 ? contactsUiState.friendRequestTotal : i;
        int i7 = (i3 & 256) != 0 ? contactsUiState.friendRequestPending : i2;
        boolean z18 = (i3 & 512) != 0 ? contactsUiState.friendRequestsLoading : z2;
        boolean z19 = (i3 & 1024) != 0 ? contactsUiState.friendRequestsExpanded : z3;
        FriendRequestItem friendRequestItem3 = (i3 & 2048) != 0 ? contactsUiState.selectedFriendRequest : friendRequestItem;
        boolean z20 = (i3 & 4096) != 0 ? contactsUiState.friendRequestProcessing : z4;
        boolean z21 = (i3 & 8192) != 0 ? contactsUiState.friendsExpanded : z5;
        boolean z22 = z17;
        boolean z23 = (i3 & 16384) != 0 ? contactsUiState.groupsExpanded : z6;
        boolean z24 = (i3 & 32768) != 0 ? contactsUiState.botsExpanded : z7;
        if ((i3 & 65536) != 0) {
            z10 = z24;
            z9 = contactsUiState.myBotsExpanded;
            z12 = z23;
            str2 = str3;
            list6 = list11;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            list10 = list15;
            i4 = i6;
            i5 = i7;
            z13 = z18;
            z14 = z19;
            friendRequestItem2 = friendRequestItem3;
            z15 = z20;
            z16 = z21;
            z11 = z22;
            contactsUiState2 = contactsUiState;
        } else {
            z9 = z8;
            z10 = z24;
            z11 = z22;
            contactsUiState2 = contactsUiState;
            z12 = z23;
            str2 = str3;
            list6 = list11;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            list10 = list15;
            i4 = i6;
            i5 = i7;
            z13 = z18;
            z14 = z19;
            friendRequestItem2 = friendRequestItem3;
            z15 = z20;
            z16 = z21;
        }
        return contactsUiState2.copy(z11, str2, list6, list7, list8, list9, list10, i4, i5, z13, z14, friendRequestItem2, z15, z16, z12, z10, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getFriendRequestsLoading() {
        return this.friendRequestsLoading;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getFriendRequestsExpanded() {
        return this.friendRequestsExpanded;
    }

    /* renamed from: component12, reason: from getter */
    public final FriendRequestItem getSelectedFriendRequest() {
        return this.selectedFriendRequest;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getFriendRequestProcessing() {
        return this.friendRequestProcessing;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getFriendsExpanded() {
        return this.friendsExpanded;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getGroupsExpanded() {
        return this.groupsExpanded;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getBotsExpanded() {
        return this.botsExpanded;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getMyBotsExpanded() {
        return this.myBotsExpanded;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final List<Contact> component3() {
        return this.friends;
    }

    public final List<Contact> component4() {
        return this.groups;
    }

    public final List<Contact> component5() {
        return this.bots;
    }

    public final List<Contact> component6() {
        return this.myBots;
    }

    public final List<FriendRequestItem> component7() {
        return this.friendRequests;
    }

    /* renamed from: component8, reason: from getter */
    public final int getFriendRequestTotal() {
        return this.friendRequestTotal;
    }

    /* renamed from: component9, reason: from getter */
    public final int getFriendRequestPending() {
        return this.friendRequestPending;
    }

    public final ContactsUiState copy(boolean isLoading, String error, List<Contact> friends, List<Contact> groups, List<Contact> bots, List<Contact> myBots, List<FriendRequestItem> friendRequests, int friendRequestTotal, int friendRequestPending, boolean friendRequestsLoading, boolean friendRequestsExpanded, FriendRequestItem selectedFriendRequest, boolean friendRequestProcessing, boolean friendsExpanded, boolean groupsExpanded, boolean botsExpanded, boolean myBotsExpanded) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(bots, "bots");
        Intrinsics.checkNotNullParameter(myBots, "myBots");
        Intrinsics.checkNotNullParameter(friendRequests, "friendRequests");
        return new ContactsUiState(isLoading, error, friends, groups, bots, myBots, friendRequests, friendRequestTotal, friendRequestPending, friendRequestsLoading, friendRequestsExpanded, selectedFriendRequest, friendRequestProcessing, friendsExpanded, groupsExpanded, botsExpanded, myBotsExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactsUiState)) {
            return false;
        }
        ContactsUiState contactsUiState = (ContactsUiState) other;
        return this.isLoading == contactsUiState.isLoading && Intrinsics.areEqual(this.error, contactsUiState.error) && Intrinsics.areEqual(this.friends, contactsUiState.friends) && Intrinsics.areEqual(this.groups, contactsUiState.groups) && Intrinsics.areEqual(this.bots, contactsUiState.bots) && Intrinsics.areEqual(this.myBots, contactsUiState.myBots) && Intrinsics.areEqual(this.friendRequests, contactsUiState.friendRequests) && this.friendRequestTotal == contactsUiState.friendRequestTotal && this.friendRequestPending == contactsUiState.friendRequestPending && this.friendRequestsLoading == contactsUiState.friendRequestsLoading && this.friendRequestsExpanded == contactsUiState.friendRequestsExpanded && Intrinsics.areEqual(this.selectedFriendRequest, contactsUiState.selectedFriendRequest) && this.friendRequestProcessing == contactsUiState.friendRequestProcessing && this.friendsExpanded == contactsUiState.friendsExpanded && this.groupsExpanded == contactsUiState.groupsExpanded && this.botsExpanded == contactsUiState.botsExpanded && this.myBotsExpanded == contactsUiState.myBotsExpanded;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + this.friends.hashCode()) * 31) + this.groups.hashCode()) * 31) + this.bots.hashCode()) * 31) + this.myBots.hashCode()) * 31) + this.friendRequests.hashCode()) * 31) + Integer.hashCode(this.friendRequestTotal)) * 31) + Integer.hashCode(this.friendRequestPending)) * 31) + Boolean.hashCode(this.friendRequestsLoading)) * 31) + Boolean.hashCode(this.friendRequestsExpanded)) * 31) + (this.selectedFriendRequest != null ? this.selectedFriendRequest.hashCode() : 0)) * 31) + Boolean.hashCode(this.friendRequestProcessing)) * 31) + Boolean.hashCode(this.friendsExpanded)) * 31) + Boolean.hashCode(this.groupsExpanded)) * 31) + Boolean.hashCode(this.botsExpanded)) * 31) + Boolean.hashCode(this.myBotsExpanded);
    }

    public String toString() {
        return "ContactsUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", friends=" + this.friends + ", groups=" + this.groups + ", bots=" + this.bots + ", myBots=" + this.myBots + ", friendRequests=" + this.friendRequests + ", friendRequestTotal=" + this.friendRequestTotal + ", friendRequestPending=" + this.friendRequestPending + ", friendRequestsLoading=" + this.friendRequestsLoading + ", friendRequestsExpanded=" + this.friendRequestsExpanded + ", selectedFriendRequest=" + this.selectedFriendRequest + ", friendRequestProcessing=" + this.friendRequestProcessing + ", friendsExpanded=" + this.friendsExpanded + ", groupsExpanded=" + this.groupsExpanded + ", botsExpanded=" + this.botsExpanded + ", myBotsExpanded=" + this.myBotsExpanded + ")";
    }

    public ContactsUiState(boolean isLoading, String error, List<Contact> friends, List<Contact> groups, List<Contact> bots, List<Contact> myBots, List<FriendRequestItem> friendRequests, int friendRequestTotal, int friendRequestPending, boolean friendRequestsLoading, boolean friendRequestsExpanded, FriendRequestItem selectedFriendRequest, boolean friendRequestProcessing, boolean friendsExpanded, boolean groupsExpanded, boolean botsExpanded, boolean myBotsExpanded) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(bots, "bots");
        Intrinsics.checkNotNullParameter(myBots, "myBots");
        Intrinsics.checkNotNullParameter(friendRequests, "friendRequests");
        this.isLoading = isLoading;
        this.error = error;
        this.friends = friends;
        this.groups = groups;
        this.bots = bots;
        this.myBots = myBots;
        this.friendRequests = friendRequests;
        this.friendRequestTotal = friendRequestTotal;
        this.friendRequestPending = friendRequestPending;
        this.friendRequestsLoading = friendRequestsLoading;
        this.friendRequestsExpanded = friendRequestsExpanded;
        this.selectedFriendRequest = selectedFriendRequest;
        this.friendRequestProcessing = friendRequestProcessing;
        this.friendsExpanded = friendsExpanded;
        this.groupsExpanded = groupsExpanded;
        this.botsExpanded = botsExpanded;
        this.myBotsExpanded = myBotsExpanded;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ContactsUiState(boolean z, String str, List list, List list2, List list3, List list4, List list5, int i, int i2, boolean z2, boolean z3, FriendRequestItem friendRequestItem, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z9 = (i3 & 1) != 0 ? false : z;
        String str2 = (i3 & 2) != 0 ? null : str;
        List listEmptyList = (i3 & 4) != 0 ? CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i3 & 8) != 0 ? CollectionsKt.emptyList() : list2;
        List listEmptyList3 = (i3 & 16) != 0 ? CollectionsKt.emptyList() : list3;
        List listEmptyList4 = (i3 & 32) != 0 ? CollectionsKt.emptyList() : list4;
        List listEmptyList5 = (i3 & 64) != 0 ? CollectionsKt.emptyList() : list5;
        int i4 = (i3 & 128) != 0 ? 0 : i;
        int i5 = (i3 & 256) != 0 ? 0 : i2;
        boolean z10 = (i3 & 512) != 0 ? false : z2;
        boolean z11 = (i3 & 1024) != 0 ? false : z3;
        FriendRequestItem friendRequestItem2 = (i3 & 2048) == 0 ? friendRequestItem : null;
        this(z9, str2, listEmptyList, listEmptyList2, listEmptyList3, listEmptyList4, listEmptyList5, i4, i5, z10, z11, friendRequestItem2, (i3 & 4096) != 0 ? false : z4, (i3 & 8192) != 0 ? false : z5, (i3 & 16384) != 0 ? false : z6, (i3 & 32768) != 0 ? false : z7, (i3 & 65536) != 0 ? false : z8);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final List<Contact> getFriends() {
        return this.friends;
    }

    public final List<Contact> getGroups() {
        return this.groups;
    }

    public final List<Contact> getBots() {
        return this.bots;
    }

    public final List<Contact> getMyBots() {
        return this.myBots;
    }

    public final List<FriendRequestItem> getFriendRequests() {
        return this.friendRequests;
    }

    public final int getFriendRequestTotal() {
        return this.friendRequestTotal;
    }

    public final int getFriendRequestPending() {
        return this.friendRequestPending;
    }

    public final boolean getFriendRequestsLoading() {
        return this.friendRequestsLoading;
    }

    public final boolean getFriendRequestsExpanded() {
        return this.friendRequestsExpanded;
    }

    public final FriendRequestItem getSelectedFriendRequest() {
        return this.selectedFriendRequest;
    }

    public final boolean getFriendRequestProcessing() {
        return this.friendRequestProcessing;
    }

    public final boolean getFriendsExpanded() {
        return this.friendsExpanded;
    }

    public final boolean getGroupsExpanded() {
        return this.groupsExpanded;
    }

    public final boolean getBotsExpanded() {
        return this.botsExpanded;
    }

    public final boolean getMyBotsExpanded() {
        return this.myBotsExpanded;
    }
}
