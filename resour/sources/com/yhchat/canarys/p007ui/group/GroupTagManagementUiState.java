package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.api.GroupTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupTagManagementViewModel.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bH\u00c6\u0003Jy\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupTagManagementUiState;", "", "tags", "", "Lcom/yhchat/canarys/data/api/GroupTag;", "isLoading", "", "error", "", "showCreateDialog", "editingTag", "editingTagName", "editingTagColor", "editingTagDesc", "isSaving", "saveError", "<init>", "(Ljava/util/List;ZLjava/lang/String;ZLcom/yhchat/canarys/data/api/GroupTag;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getTags", "()Ljava/util/List;", "()Z", "getError", "()Ljava/lang/String;", "getShowCreateDialog", "getEditingTag", "()Lcom/yhchat/canarys/data/api/GroupTag;", "getEditingTagName", "getEditingTagColor", "getEditingTagDesc", "getSaveError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GroupTagManagementUiState {
    public static final int $stable = 8;
    private final GroupTag editingTag;
    private final String editingTagColor;
    private final String editingTagDesc;
    private final String editingTagName;
    private final String error;
    private final boolean isLoading;
    private final boolean isSaving;
    private final String saveError;
    private final boolean showCreateDialog;
    private final List<GroupTag> tags;

    public GroupTagManagementUiState() {
        this(null, false, null, false, null, null, null, null, false, null, 1023, null);
    }

    public static /* synthetic */ GroupTagManagementUiState copy$default(GroupTagManagementUiState groupTagManagementUiState, List list, boolean z, String str, boolean z2, GroupTag groupTag, String str2, String str3, String str4, boolean z3, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupTagManagementUiState.tags;
        }
        if ((i & 2) != 0) {
            z = groupTagManagementUiState.isLoading;
        }
        if ((i & 4) != 0) {
            str = groupTagManagementUiState.error;
        }
        if ((i & 8) != 0) {
            z2 = groupTagManagementUiState.showCreateDialog;
        }
        if ((i & 16) != 0) {
            groupTag = groupTagManagementUiState.editingTag;
        }
        if ((i & 32) != 0) {
            str2 = groupTagManagementUiState.editingTagName;
        }
        if ((i & 64) != 0) {
            str3 = groupTagManagementUiState.editingTagColor;
        }
        if ((i & 128) != 0) {
            str4 = groupTagManagementUiState.editingTagDesc;
        }
        if ((i & 256) != 0) {
            z3 = groupTagManagementUiState.isSaving;
        }
        if ((i & 512) != 0) {
            str5 = groupTagManagementUiState.saveError;
        }
        boolean z4 = z3;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        GroupTag groupTag2 = groupTag;
        String str9 = str2;
        return groupTagManagementUiState.copy(list, z, str, z2, groupTag2, str9, str7, str8, z4, str6);
    }

    public final List<GroupTag> component1() {
        return this.tags;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSaveError() {
        return this.saveError;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCreateDialog() {
        return this.showCreateDialog;
    }

    /* renamed from: component5, reason: from getter */
    public final GroupTag getEditingTag() {
        return this.editingTag;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEditingTagName() {
        return this.editingTagName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEditingTagColor() {
        return this.editingTagColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEditingTagDesc() {
        return this.editingTagDesc;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    public final GroupTagManagementUiState copy(List<GroupTag> tags, boolean isLoading, String error, boolean showCreateDialog, GroupTag editingTag, String editingTagName, String editingTagColor, String editingTagDesc, boolean isSaving, String saveError) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(editingTagName, "editingTagName");
        Intrinsics.checkNotNullParameter(editingTagColor, "editingTagColor");
        Intrinsics.checkNotNullParameter(editingTagDesc, "editingTagDesc");
        return new GroupTagManagementUiState(tags, isLoading, error, showCreateDialog, editingTag, editingTagName, editingTagColor, editingTagDesc, isSaving, saveError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupTagManagementUiState)) {
            return false;
        }
        GroupTagManagementUiState groupTagManagementUiState = (GroupTagManagementUiState) other;
        return Intrinsics.areEqual(this.tags, groupTagManagementUiState.tags) && this.isLoading == groupTagManagementUiState.isLoading && Intrinsics.areEqual(this.error, groupTagManagementUiState.error) && this.showCreateDialog == groupTagManagementUiState.showCreateDialog && Intrinsics.areEqual(this.editingTag, groupTagManagementUiState.editingTag) && Intrinsics.areEqual(this.editingTagName, groupTagManagementUiState.editingTagName) && Intrinsics.areEqual(this.editingTagColor, groupTagManagementUiState.editingTagColor) && Intrinsics.areEqual(this.editingTagDesc, groupTagManagementUiState.editingTagDesc) && this.isSaving == groupTagManagementUiState.isSaving && Intrinsics.areEqual(this.saveError, groupTagManagementUiState.saveError);
    }

    public int hashCode() {
        return (((((((((((((((((this.tags.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.showCreateDialog)) * 31) + (this.editingTag == null ? 0 : this.editingTag.hashCode())) * 31) + this.editingTagName.hashCode()) * 31) + this.editingTagColor.hashCode()) * 31) + this.editingTagDesc.hashCode()) * 31) + Boolean.hashCode(this.isSaving)) * 31) + (this.saveError != null ? this.saveError.hashCode() : 0);
    }

    public String toString() {
        return "GroupTagManagementUiState(tags=" + this.tags + ", isLoading=" + this.isLoading + ", error=" + this.error + ", showCreateDialog=" + this.showCreateDialog + ", editingTag=" + this.editingTag + ", editingTagName=" + this.editingTagName + ", editingTagColor=" + this.editingTagColor + ", editingTagDesc=" + this.editingTagDesc + ", isSaving=" + this.isSaving + ", saveError=" + this.saveError + ")";
    }

    public GroupTagManagementUiState(List<GroupTag> tags, boolean isLoading, String error, boolean showCreateDialog, GroupTag editingTag, String editingTagName, String editingTagColor, String editingTagDesc, boolean isSaving, String saveError) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(editingTagName, "editingTagName");
        Intrinsics.checkNotNullParameter(editingTagColor, "editingTagColor");
        Intrinsics.checkNotNullParameter(editingTagDesc, "editingTagDesc");
        this.tags = tags;
        this.isLoading = isLoading;
        this.error = error;
        this.showCreateDialog = showCreateDialog;
        this.editingTag = editingTag;
        this.editingTagName = editingTagName;
        this.editingTagColor = editingTagColor;
        this.editingTagDesc = editingTagDesc;
        this.isSaving = isSaving;
        this.saveError = saveError;
    }

    public /* synthetic */ GroupTagManagementUiState(List list, boolean z, String str, boolean z2, GroupTag groupTag, String str2, String str3, String str4, boolean z3, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : groupTag, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "#2196F3" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : str5);
    }

    public final List<GroupTag> getTags() {
        return this.tags;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getShowCreateDialog() {
        return this.showCreateDialog;
    }

    public final GroupTag getEditingTag() {
        return this.editingTag;
    }

    public final String getEditingTagName() {
        return this.editingTagName;
    }

    public final String getEditingTagColor() {
        return this.editingTagColor;
    }

    public final String getEditingTagDesc() {
        return this.editingTagDesc;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final String getSaveError() {
        return this.saveError;
    }
}
