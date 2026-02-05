package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.model.GroupDetail;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupSettingsViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u00ef\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0014H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u00f1\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010J\u001a\u00020\u00032\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020\u0018H\u00d6\u0001J\t\u0010M\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010 R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010 R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010 R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010 \u00a8\u0006N"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupSettingsUiState;", "", "isLoading", "", "error", "", "groupInfo", "Lcom/yhchat/canarys/data/model/GroupDetail;", "isEditing", "isSaving", "saveError", "isSaveSuccess", "editedName", "editedIntroduction", "editedAvatarUrl", "editedDirectJoin", "editedHistoryMsg", "editedPrivate", "editedCategoryName", "editedCategoryId", "", "showMessageTypeLimitDialog", "selectedMessageTypes", "", "", "isSettingMessageTypeLimit", "showAutoDeleteMessageDialog", "isSettingAutoDeleteMessage", "isSettingHideGroupMembers", "isSettingDenyMembersUploadToGroupDisk", "<init>", "(ZLjava/lang/String;Lcom/yhchat/canarys/data/model/GroupDetail;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;JZLjava/util/Set;ZZZZZ)V", "()Z", "getError", "()Ljava/lang/String;", "getGroupInfo", "()Lcom/yhchat/canarys/data/model/GroupDetail;", "getSaveError", "getEditedName", "getEditedIntroduction", "getEditedAvatarUrl", "getEditedDirectJoin", "getEditedHistoryMsg", "getEditedPrivate", "getEditedCategoryName", "getEditedCategoryId", "()J", "getShowMessageTypeLimitDialog", "getSelectedMessageTypes", "()Ljava/util/Set;", "getShowAutoDeleteMessageDialog", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GroupSettingsUiState {
    public static final int $stable = 8;
    private final String editedAvatarUrl;
    private final long editedCategoryId;
    private final String editedCategoryName;
    private final boolean editedDirectJoin;
    private final boolean editedHistoryMsg;
    private final String editedIntroduction;
    private final String editedName;
    private final boolean editedPrivate;
    private final String error;
    private final GroupDetail groupInfo;
    private final boolean isEditing;
    private final boolean isLoading;
    private final boolean isSaveSuccess;
    private final boolean isSaving;
    private final boolean isSettingAutoDeleteMessage;
    private final boolean isSettingDenyMembersUploadToGroupDisk;
    private final boolean isSettingHideGroupMembers;
    private final boolean isSettingMessageTypeLimit;
    private final String saveError;
    private final Set<Integer> selectedMessageTypes;
    private final boolean showAutoDeleteMessageDialog;
    private final boolean showMessageTypeLimitDialog;

    public GroupSettingsUiState() {
        this(false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194303, null);
    }

    public static /* synthetic */ GroupSettingsUiState copy$default(GroupSettingsUiState groupSettingsUiState, boolean z, String str, GroupDetail groupDetail, boolean z2, boolean z3, String str2, boolean z4, String str3, String str4, String str5, boolean z5, boolean z6, boolean z7, String str6, long j, boolean z8, Set set, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i, Object obj) {
        boolean z14;
        boolean z15;
        boolean z16 = (i & 1) != 0 ? groupSettingsUiState.isLoading : z;
        String str7 = (i & 2) != 0 ? groupSettingsUiState.error : str;
        GroupDetail groupDetail2 = (i & 4) != 0 ? groupSettingsUiState.groupInfo : groupDetail;
        boolean z17 = (i & 8) != 0 ? groupSettingsUiState.isEditing : z2;
        boolean z18 = (i & 16) != 0 ? groupSettingsUiState.isSaving : z3;
        String str8 = (i & 32) != 0 ? groupSettingsUiState.saveError : str2;
        boolean z19 = (i & 64) != 0 ? groupSettingsUiState.isSaveSuccess : z4;
        String str9 = (i & 128) != 0 ? groupSettingsUiState.editedName : str3;
        String str10 = (i & 256) != 0 ? groupSettingsUiState.editedIntroduction : str4;
        String str11 = (i & 512) != 0 ? groupSettingsUiState.editedAvatarUrl : str5;
        boolean z20 = (i & 1024) != 0 ? groupSettingsUiState.editedDirectJoin : z5;
        boolean z21 = (i & 2048) != 0 ? groupSettingsUiState.editedHistoryMsg : z6;
        boolean z22 = (i & 4096) != 0 ? groupSettingsUiState.editedPrivate : z7;
        String str12 = (i & 8192) != 0 ? groupSettingsUiState.editedCategoryName : str6;
        boolean z23 = z16;
        long j2 = (i & 16384) != 0 ? groupSettingsUiState.editedCategoryId : j;
        boolean z24 = (i & 32768) != 0 ? groupSettingsUiState.showMessageTypeLimitDialog : z8;
        Set set2 = (i & 65536) != 0 ? groupSettingsUiState.selectedMessageTypes : set;
        boolean z25 = z24;
        boolean z26 = (i & 131072) != 0 ? groupSettingsUiState.isSettingMessageTypeLimit : z9;
        boolean z27 = (i & 262144) != 0 ? groupSettingsUiState.showAutoDeleteMessageDialog : z10;
        boolean z28 = (i & 524288) != 0 ? groupSettingsUiState.isSettingAutoDeleteMessage : z11;
        boolean z29 = (i & 1048576) != 0 ? groupSettingsUiState.isSettingHideGroupMembers : z12;
        if ((i & 2097152) != 0) {
            z15 = z29;
            z14 = groupSettingsUiState.isSettingDenyMembersUploadToGroupDisk;
        } else {
            z14 = z13;
            z15 = z29;
        }
        return groupSettingsUiState.copy(z23, str7, groupDetail2, z17, z18, str8, z19, str9, str10, str11, z20, z21, z22, str12, j2, z25, set2, z26, z27, z28, z15, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEditedAvatarUrl() {
        return this.editedAvatarUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getEditedDirectJoin() {
        return this.editedDirectJoin;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getEditedHistoryMsg() {
        return this.editedHistoryMsg;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getEditedPrivate() {
        return this.editedPrivate;
    }

    /* renamed from: component14, reason: from getter */
    public final String getEditedCategoryName() {
        return this.editedCategoryName;
    }

    /* renamed from: component15, reason: from getter */
    public final long getEditedCategoryId() {
        return this.editedCategoryId;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShowMessageTypeLimitDialog() {
        return this.showMessageTypeLimitDialog;
    }

    public final Set<Integer> component17() {
        return this.selectedMessageTypes;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsSettingMessageTypeLimit() {
        return this.isSettingMessageTypeLimit;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getShowAutoDeleteMessageDialog() {
        return this.showAutoDeleteMessageDialog;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsSettingAutoDeleteMessage() {
        return this.isSettingAutoDeleteMessage;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsSettingHideGroupMembers() {
        return this.isSettingHideGroupMembers;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsSettingDenyMembersUploadToGroupDisk() {
        return this.isSettingDenyMembersUploadToGroupDisk;
    }

    /* renamed from: component3, reason: from getter */
    public final GroupDetail getGroupInfo() {
        return this.groupInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSaveError() {
        return this.saveError;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSaveSuccess() {
        return this.isSaveSuccess;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEditedName() {
        return this.editedName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEditedIntroduction() {
        return this.editedIntroduction;
    }

    public final GroupSettingsUiState copy(boolean isLoading, String error, GroupDetail groupInfo, boolean isEditing, boolean isSaving, String saveError, boolean isSaveSuccess, String editedName, String editedIntroduction, String editedAvatarUrl, boolean editedDirectJoin, boolean editedHistoryMsg, boolean editedPrivate, String editedCategoryName, long editedCategoryId, boolean showMessageTypeLimitDialog, Set<Integer> selectedMessageTypes, boolean isSettingMessageTypeLimit, boolean showAutoDeleteMessageDialog, boolean isSettingAutoDeleteMessage, boolean isSettingHideGroupMembers, boolean isSettingDenyMembersUploadToGroupDisk) {
        Intrinsics.checkNotNullParameter(editedName, "editedName");
        Intrinsics.checkNotNullParameter(editedIntroduction, "editedIntroduction");
        Intrinsics.checkNotNullParameter(editedAvatarUrl, "editedAvatarUrl");
        Intrinsics.checkNotNullParameter(editedCategoryName, "editedCategoryName");
        Intrinsics.checkNotNullParameter(selectedMessageTypes, "selectedMessageTypes");
        return new GroupSettingsUiState(isLoading, error, groupInfo, isEditing, isSaving, saveError, isSaveSuccess, editedName, editedIntroduction, editedAvatarUrl, editedDirectJoin, editedHistoryMsg, editedPrivate, editedCategoryName, editedCategoryId, showMessageTypeLimitDialog, selectedMessageTypes, isSettingMessageTypeLimit, showAutoDeleteMessageDialog, isSettingAutoDeleteMessage, isSettingHideGroupMembers, isSettingDenyMembersUploadToGroupDisk);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupSettingsUiState)) {
            return false;
        }
        GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) other;
        return this.isLoading == groupSettingsUiState.isLoading && Intrinsics.areEqual(this.error, groupSettingsUiState.error) && Intrinsics.areEqual(this.groupInfo, groupSettingsUiState.groupInfo) && this.isEditing == groupSettingsUiState.isEditing && this.isSaving == groupSettingsUiState.isSaving && Intrinsics.areEqual(this.saveError, groupSettingsUiState.saveError) && this.isSaveSuccess == groupSettingsUiState.isSaveSuccess && Intrinsics.areEqual(this.editedName, groupSettingsUiState.editedName) && Intrinsics.areEqual(this.editedIntroduction, groupSettingsUiState.editedIntroduction) && Intrinsics.areEqual(this.editedAvatarUrl, groupSettingsUiState.editedAvatarUrl) && this.editedDirectJoin == groupSettingsUiState.editedDirectJoin && this.editedHistoryMsg == groupSettingsUiState.editedHistoryMsg && this.editedPrivate == groupSettingsUiState.editedPrivate && Intrinsics.areEqual(this.editedCategoryName, groupSettingsUiState.editedCategoryName) && this.editedCategoryId == groupSettingsUiState.editedCategoryId && this.showMessageTypeLimitDialog == groupSettingsUiState.showMessageTypeLimitDialog && Intrinsics.areEqual(this.selectedMessageTypes, groupSettingsUiState.selectedMessageTypes) && this.isSettingMessageTypeLimit == groupSettingsUiState.isSettingMessageTypeLimit && this.showAutoDeleteMessageDialog == groupSettingsUiState.showAutoDeleteMessageDialog && this.isSettingAutoDeleteMessage == groupSettingsUiState.isSettingAutoDeleteMessage && this.isSettingHideGroupMembers == groupSettingsUiState.isSettingHideGroupMembers && this.isSettingDenyMembersUploadToGroupDisk == groupSettingsUiState.isSettingDenyMembersUploadToGroupDisk;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.groupInfo == null ? 0 : this.groupInfo.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.isSaving)) * 31) + (this.saveError != null ? this.saveError.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSaveSuccess)) * 31) + this.editedName.hashCode()) * 31) + this.editedIntroduction.hashCode()) * 31) + this.editedAvatarUrl.hashCode()) * 31) + Boolean.hashCode(this.editedDirectJoin)) * 31) + Boolean.hashCode(this.editedHistoryMsg)) * 31) + Boolean.hashCode(this.editedPrivate)) * 31) + this.editedCategoryName.hashCode()) * 31) + Long.hashCode(this.editedCategoryId)) * 31) + Boolean.hashCode(this.showMessageTypeLimitDialog)) * 31) + this.selectedMessageTypes.hashCode()) * 31) + Boolean.hashCode(this.isSettingMessageTypeLimit)) * 31) + Boolean.hashCode(this.showAutoDeleteMessageDialog)) * 31) + Boolean.hashCode(this.isSettingAutoDeleteMessage)) * 31) + Boolean.hashCode(this.isSettingHideGroupMembers)) * 31) + Boolean.hashCode(this.isSettingDenyMembersUploadToGroupDisk);
    }

    public String toString() {
        return "GroupSettingsUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", groupInfo=" + this.groupInfo + ", isEditing=" + this.isEditing + ", isSaving=" + this.isSaving + ", saveError=" + this.saveError + ", isSaveSuccess=" + this.isSaveSuccess + ", editedName=" + this.editedName + ", editedIntroduction=" + this.editedIntroduction + ", editedAvatarUrl=" + this.editedAvatarUrl + ", editedDirectJoin=" + this.editedDirectJoin + ", editedHistoryMsg=" + this.editedHistoryMsg + ", editedPrivate=" + this.editedPrivate + ", editedCategoryName=" + this.editedCategoryName + ", editedCategoryId=" + this.editedCategoryId + ", showMessageTypeLimitDialog=" + this.showMessageTypeLimitDialog + ", selectedMessageTypes=" + this.selectedMessageTypes + ", isSettingMessageTypeLimit=" + this.isSettingMessageTypeLimit + ", showAutoDeleteMessageDialog=" + this.showAutoDeleteMessageDialog + ", isSettingAutoDeleteMessage=" + this.isSettingAutoDeleteMessage + ", isSettingHideGroupMembers=" + this.isSettingHideGroupMembers + ", isSettingDenyMembersUploadToGroupDisk=" + this.isSettingDenyMembersUploadToGroupDisk + ")";
    }

    public GroupSettingsUiState(boolean isLoading, String error, GroupDetail groupInfo, boolean isEditing, boolean isSaving, String saveError, boolean isSaveSuccess, String editedName, String editedIntroduction, String editedAvatarUrl, boolean editedDirectJoin, boolean editedHistoryMsg, boolean editedPrivate, String editedCategoryName, long editedCategoryId, boolean showMessageTypeLimitDialog, Set<Integer> selectedMessageTypes, boolean isSettingMessageTypeLimit, boolean showAutoDeleteMessageDialog, boolean isSettingAutoDeleteMessage, boolean isSettingHideGroupMembers, boolean isSettingDenyMembersUploadToGroupDisk) {
        Intrinsics.checkNotNullParameter(editedName, "editedName");
        Intrinsics.checkNotNullParameter(editedIntroduction, "editedIntroduction");
        Intrinsics.checkNotNullParameter(editedAvatarUrl, "editedAvatarUrl");
        Intrinsics.checkNotNullParameter(editedCategoryName, "editedCategoryName");
        Intrinsics.checkNotNullParameter(selectedMessageTypes, "selectedMessageTypes");
        this.isLoading = isLoading;
        this.error = error;
        this.groupInfo = groupInfo;
        this.isEditing = isEditing;
        this.isSaving = isSaving;
        this.saveError = saveError;
        this.isSaveSuccess = isSaveSuccess;
        this.editedName = editedName;
        this.editedIntroduction = editedIntroduction;
        this.editedAvatarUrl = editedAvatarUrl;
        this.editedDirectJoin = editedDirectJoin;
        this.editedHistoryMsg = editedHistoryMsg;
        this.editedPrivate = editedPrivate;
        this.editedCategoryName = editedCategoryName;
        this.editedCategoryId = editedCategoryId;
        this.showMessageTypeLimitDialog = showMessageTypeLimitDialog;
        this.selectedMessageTypes = selectedMessageTypes;
        this.isSettingMessageTypeLimit = isSettingMessageTypeLimit;
        this.showAutoDeleteMessageDialog = showAutoDeleteMessageDialog;
        this.isSettingAutoDeleteMessage = isSettingAutoDeleteMessage;
        this.isSettingHideGroupMembers = isSettingHideGroupMembers;
        this.isSettingDenyMembersUploadToGroupDisk = isSettingDenyMembersUploadToGroupDisk;
    }

    public /* synthetic */ GroupSettingsUiState(boolean z, String str, GroupDetail groupDetail, boolean z2, boolean z3, String str2, boolean z4, String str3, String str4, String str5, boolean z5, boolean z6, boolean z7, String str6, long j, boolean z8, Set set, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : groupDetail, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? false : z6, (i & 4096) != 0 ? false : z7, (i & 8192) == 0 ? str6 : "", (i & 16384) != 0 ? 0L : j, (32768 & i) != 0 ? false : z8, (i & 65536) != 0 ? SetsKt.emptySet() : set, (i & 131072) != 0 ? false : z9, (i & 262144) != 0 ? false : z10, (i & 524288) != 0 ? false : z11, (i & 1048576) != 0 ? false : z12, (i & 2097152) != 0 ? false : z13);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final GroupDetail getGroupInfo() {
        return this.groupInfo;
    }

    public final boolean isEditing() {
        return this.isEditing;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final String getSaveError() {
        return this.saveError;
    }

    public final boolean isSaveSuccess() {
        return this.isSaveSuccess;
    }

    public final String getEditedName() {
        return this.editedName;
    }

    public final String getEditedIntroduction() {
        return this.editedIntroduction;
    }

    public final String getEditedAvatarUrl() {
        return this.editedAvatarUrl;
    }

    public final boolean getEditedDirectJoin() {
        return this.editedDirectJoin;
    }

    public final boolean getEditedHistoryMsg() {
        return this.editedHistoryMsg;
    }

    public final boolean getEditedPrivate() {
        return this.editedPrivate;
    }

    public final String getEditedCategoryName() {
        return this.editedCategoryName;
    }

    public final long getEditedCategoryId() {
        return this.editedCategoryId;
    }

    public final boolean getShowMessageTypeLimitDialog() {
        return this.showMessageTypeLimitDialog;
    }

    public final Set<Integer> getSelectedMessageTypes() {
        return this.selectedMessageTypes;
    }

    public final boolean isSettingMessageTypeLimit() {
        return this.isSettingMessageTypeLimit;
    }

    public final boolean getShowAutoDeleteMessageDialog() {
        return this.showAutoDeleteMessageDialog;
    }

    public final boolean isSettingAutoDeleteMessage() {
        return this.isSettingAutoDeleteMessage;
    }

    public final boolean isSettingHideGroupMembers() {
        return this.isSettingHideGroupMembers;
    }

    public final boolean isSettingDenyMembersUploadToGroupDisk() {
        return this.isSettingDenyMembersUploadToGroupDisk;
    }
}
