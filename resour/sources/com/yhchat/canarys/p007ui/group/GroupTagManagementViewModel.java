package com.yhchat.canarys.p007ui.group;

import androidx.autofill.HintConstants;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.GroupTag;
import com.yhchat.canarys.data.repository.GroupTagRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GroupTagManagementViewModel.kt */
@Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupTagManagementViewModel;", "Landroidx/lifecycle/ViewModel;", "groupTagRepository", "Lcom/yhchat/canarys/data/repository/GroupTagRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/GroupTagRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/group/GroupTagManagementUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadTags", "", "groupId", "", "showCreateDialog", "showEditDialog", "tag", "Lcom/yhchat/canarys/data/api/GroupTag;", "dismissDialog", "updateTagName", HintConstants.AUTOFILL_HINT_NAME, "updateTagColor", "color", "updateTagDesc", "desc", "saveTag", "deleteTag", "tagId", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupTagManagementViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GroupTagManagementUiState> _uiState;
    private final GroupTagRepository groupTagRepository;
    private final StateFlow<GroupTagManagementUiState> uiState;

    @Inject
    public GroupTagManagementViewModel(GroupTagRepository groupTagRepository) {
        Intrinsics.checkNotNullParameter(groupTagRepository, "groupTagRepository");
        this.groupTagRepository = groupTagRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new GroupTagManagementUiState(null, false, null, false, null, null, null, null, false, null, 1023, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final StateFlow<GroupTagManagementUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: GroupTagManagementViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagManagementViewModel$loadTags$1", m185f = "GroupTagManagementViewModel.kt", m186i = {}, m187l = {29}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagManagementViewModel$loadTags$1 */
    static final class C40221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40221(String str, Continuation<? super C40221> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupTagManagementViewModel.this.new C40221(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupTagManagementViewModel.this._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) GroupTagManagementViewModel.this._uiState.getValue(), null, true, null, false, null, null, null, null, false, null, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, null));
                    this.label = 1;
                    Object objM8596getGroupTagListyxL6bBk = GroupTagManagementViewModel.this.groupTagRepository.m8596getGroupTagListyxL6bBk(this.$groupId, (14 & 2) != 0 ? 1 : 0, (14 & 4) != 0 ? 50 : 0, (14 & 8) != 0 ? "" : null, this);
                    if (objM8596getGroupTagListyxL6bBk != coroutine_suspended) {
                        value = objM8596getGroupTagListyxL6bBk;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupTagManagementViewModel groupTagManagementViewModel = GroupTagManagementViewModel.this;
            GroupTagManagementViewModel groupTagManagementViewModel2 = GroupTagManagementViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                groupTagManagementViewModel._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) groupTagManagementViewModel._uiState.getValue(), (List) value, false, null, false, null, null, null, null, false, null, PointerIconCompat.TYPE_GRAB, null));
            } else {
                groupTagManagementViewModel2._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) groupTagManagementViewModel2._uiState.getValue(), null, false, thM11922exceptionOrNullimpl.getMessage(), false, null, null, null, null, false, null, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadTags(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40221(groupId, null), 3, null);
    }

    public final void showCreateDialog() {
        this._uiState.setValue(GroupTagManagementUiState.copy$default(this._uiState.getValue(), null, false, null, true, null, "", "#2196F3", "", false, null, 775, null));
    }

    public final void showEditDialog(GroupTag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this._uiState.setValue(GroupTagManagementUiState.copy$default(this._uiState.getValue(), null, false, null, true, tag, tag.getTag(), tag.getColor(), tag.getDesc(), false, null, 775, null));
    }

    public final void dismissDialog() {
        this._uiState.setValue(GroupTagManagementUiState.copy$default(this._uiState.getValue(), null, false, null, false, null, null, null, null, false, null, 487, null));
    }

    public final void updateTagName(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this._uiState.setValue(GroupTagManagementUiState.copy$default(this._uiState.getValue(), null, false, null, false, null, str, null, null, false, null, 991, null));
    }

    public final void updateTagColor(String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this._uiState.setValue(GroupTagManagementUiState.copy$default(this._uiState.getValue(), null, false, null, false, null, null, color, null, false, null, 959, null));
    }

    public final void updateTagDesc(String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this._uiState.setValue(GroupTagManagementUiState.copy$default(this._uiState.getValue(), null, false, null, false, null, null, null, desc, false, null, 895, null));
    }

    public final void saveTag(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        GroupTag editingTag = this._uiState.getValue().getEditingTag();
        String tagName = StringsKt.trim((CharSequence) this._uiState.getValue().getEditingTagName()).toString();
        String tagColor = this._uiState.getValue().getEditingTagColor();
        String tagDesc = StringsKt.trim((CharSequence) this._uiState.getValue().getEditingTagDesc()).toString();
        if (!(tagName.length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40231(editingTag, groupId, tagName, tagColor, tagDesc, null), 3, null);
        } else {
            this._uiState.setValue(GroupTagManagementUiState.copy$default(this._uiState.getValue(), null, false, null, false, null, null, null, null, false, "\u6807\u7b7e\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a", 511, null));
        }
    }

    /* compiled from: GroupTagManagementViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagManagementViewModel$saveTag$1", m185f = "GroupTagManagementViewModel.kt", m186i = {}, m187l = {105, 114}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagManagementViewModel$saveTag$1 */
    static final class C40231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GroupTag $editingTag;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $tagColor;
        final /* synthetic */ String $tagDesc;
        final /* synthetic */ String $tagName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40231(GroupTag groupTag, String str, String str2, String str3, String str4, Continuation<? super C40231> continuation) {
            super(2, continuation);
            this.$editingTag = groupTag;
            this.$groupId = str;
            this.$tagName = str2;
            this.$tagColor = str3;
            this.$tagDesc = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupTagManagementViewModel.this.new C40231(this.$editingTag, this.$groupId, this.$tagName, this.$tagColor, this.$tagDesc, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupTagManagementViewModel.this._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) GroupTagManagementViewModel.this._uiState.getValue(), null, false, null, false, null, null, null, null, true, null, 255, null));
                    if (this.$editingTag != null) {
                        this.label = 1;
                        Object objM8589editGroupTagbMdYcbs$default = GroupTagRepository.m8589editGroupTagbMdYcbs$default(GroupTagManagementViewModel.this.groupTagRepository, this.$editingTag.getId(), this.$groupId, this.$tagName, this.$tagColor, this.$tagDesc, 0, this, 32, null);
                        if (objM8589editGroupTagbMdYcbs$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8589editGroupTagbMdYcbs$default;
                        break;
                    } else {
                        this.label = 2;
                        Object objM8588createGroupTaghUnOzRk$default = GroupTagRepository.m8588createGroupTaghUnOzRk$default(GroupTagManagementViewModel.this.groupTagRepository, this.$groupId, this.$tagName, this.$tagColor, this.$tagDesc, 0, this, 16, null);
                        if (objM8588createGroupTaghUnOzRk$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8588createGroupTaghUnOzRk$default;
                        break;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                case 2:
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupTagManagementViewModel groupTagManagementViewModel = GroupTagManagementViewModel.this;
            String str = this.$groupId;
            GroupTagManagementViewModel groupTagManagementViewModel2 = GroupTagManagementViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) result).booleanValue();
                groupTagManagementViewModel._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) groupTagManagementViewModel._uiState.getValue(), null, false, null, false, null, null, null, null, false, null, 743, null));
                groupTagManagementViewModel.loadTags(str);
            } else {
                groupTagManagementViewModel2._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) groupTagManagementViewModel2._uiState.getValue(), null, false, null, false, null, null, null, null, false, thM11922exceptionOrNullimpl.getMessage(), 255, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GroupTagManagementViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagManagementViewModel$deleteTag$1", m185f = "GroupTagManagementViewModel.kt", m186i = {}, m187l = {149}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagManagementViewModel$deleteTag$1 */
    static final class C40211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ long $tagId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40211(long j, String str, Continuation<? super C40211> continuation) {
            super(2, continuation);
            this.$tagId = j;
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupTagManagementViewModel.this.new C40211(this.$tagId, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupTagManagementViewModel.this._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) GroupTagManagementViewModel.this._uiState.getValue(), null, true, null, false, null, null, null, null, false, null, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, null));
                    this.label = 1;
                    Object objM8594deleteGroupTaggIAlus = GroupTagManagementViewModel.this.groupTagRepository.m8594deleteGroupTaggIAlus(this.$tagId, this);
                    if (objM8594deleteGroupTaggIAlus != coroutine_suspended) {
                        value = objM8594deleteGroupTaggIAlus;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupTagManagementViewModel groupTagManagementViewModel = GroupTagManagementViewModel.this;
            String str = this.$groupId;
            GroupTagManagementViewModel groupTagManagementViewModel2 = GroupTagManagementViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupTagManagementViewModel.loadTags(str);
            } else {
                groupTagManagementViewModel2._uiState.setValue(GroupTagManagementUiState.copy$default((GroupTagManagementUiState) groupTagManagementViewModel2._uiState.getValue(), null, false, thM11922exceptionOrNullimpl.getMessage(), false, null, null, null, null, false, null, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteTag(long tagId, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40211(tagId, groupId, null), 3, null);
    }
}
