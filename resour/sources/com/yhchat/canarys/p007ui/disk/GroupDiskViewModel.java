package com.yhchat.canarys.p007ui.disk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.DiskRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p008io.CloseableKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GroupDiskActivity.kt */
@Metadata(m168d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015J\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001cH\u0002J\u001e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0015J\u0016\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"J\u0006\u0010%\u001a\u00020\u0010J\u0016\u0010&\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010'\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/GroupDiskViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "diskRepository", "Lcom/yhchat/canarys/data/repository/DiskRepository;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/disk/GroupDiskUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadFiles", "groupId", "", "folderId", "", "createFolder", "folderName", "uploadFile", "fileUri", "Landroid/net/Uri;", "getFileNameFromUri", "uri", "renameFile", "fileId", "objectType", "", "newName", "deleteFile", "resetOperationSuccess", "enterFolder", "navigateToFolder", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class GroupDiskViewModel extends ViewModel {
    public static final int $stable = 8;
    private ApiService apiService;
    private DiskRepository diskRepository;
    private final MutableStateFlow<GroupDiskUiState> _uiState = StateFlowKt.MutableStateFlow(new GroupDiskUiState(false, false, null, 0, null, false, null, 127, null));
    private final StateFlow<GroupDiskUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<GroupDiskUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.diskRepository = RepositoryFactory.INSTANCE.getDiskRepository(context);
        this.apiService = RepositoryFactory.INSTANCE.getApiService();
    }

    /* compiled from: GroupDiskActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.GroupDiskViewModel$loadFiles$1", m185f = "GroupDiskActivity.kt", m186i = {}, m187l = {798}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.GroupDiskViewModel$loadFiles$1 */
    static final class C38281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $folderId;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38281(String str, long j, Continuation<? super C38281> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$folderId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupDiskViewModel.this.new C38281(this.$groupId, this.$folderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupDiskViewModel.this._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) GroupDiskViewModel.this._uiState.getValue(), true, false, null, 0L, null, false, null, 62, null));
                    DiskRepository diskRepository = GroupDiskViewModel.this.diskRepository;
                    if (diskRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskRepository");
                        diskRepository = null;
                    }
                    this.label = 1;
                    Object objM8547getFileListyxL6bBk$default = DiskRepository.m8547getFileListyxL6bBk$default(diskRepository, this.$groupId, 2, this.$folderId, null, this, 8, null);
                    if (objM8547getFileListyxL6bBk$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8547getFileListyxL6bBk$default;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupDiskViewModel groupDiskViewModel = GroupDiskViewModel.this;
            long j = this.$folderId;
            GroupDiskViewModel groupDiskViewModel2 = GroupDiskViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                groupDiskViewModel._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel._uiState.getValue(), false, false, (List) value, j, null, false, null, 114, null));
            } else {
                groupDiskViewModel2._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel2._uiState.getValue(), false, false, null, 0L, null, false, thM11922exceptionOrNullimpl.getMessage(), 62, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadFiles$default(GroupDiskViewModel groupDiskViewModel, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        groupDiskViewModel.loadFiles(str, j);
    }

    public final void loadFiles(String groupId, long folderId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38281(groupId, folderId, null), 3, null);
    }

    /* compiled from: GroupDiskActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.GroupDiskViewModel$createFolder$1", m185f = "GroupDiskActivity.kt", m186i = {}, m187l = {822}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.GroupDiskViewModel$createFolder$1 */
    static final class C38261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $folderName;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38261(String str, String str2, Continuation<? super C38261> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$folderName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupDiskViewModel.this.new C38261(this.$groupId, this.$folderName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    DiskRepository diskRepository = GroupDiskViewModel.this.diskRepository;
                    if (diskRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskRepository");
                        diskRepository = null;
                    }
                    this.label = 1;
                    Object objM8549createFolderyxL6bBk = diskRepository.m8549createFolderyxL6bBk(this.$groupId, 2, this.$folderName, GroupDiskViewModel.this.getUiState().getValue().getCurrentFolderId(), this);
                    if (objM8549createFolderyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8549createFolderyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupDiskViewModel groupDiskViewModel = GroupDiskViewModel.this;
            GroupDiskViewModel groupDiskViewModel2 = GroupDiskViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupDiskViewModel._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel._uiState.getValue(), false, false, null, 0L, null, true, null, 95, null));
            } else {
                groupDiskViewModel2._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel2._uiState.getValue(), false, false, null, 0L, null, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void createFolder(String groupId, String folderName) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38261(groupId, folderName, null), 3, null);
    }

    /* compiled from: GroupDiskActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.GroupDiskViewModel$uploadFile$1", m185f = "GroupDiskActivity.kt", m186i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m187l = {850, 856, 871, 901}, m188m = "invokeSuspend", m189n = {"tag", "tokenRepo", "tag", "tokenRepo", "userToken", "tag", "tokenRepo", "userToken", "tokenResponse", "qiniuToken", "fileName", "tag", "tokenRepo", "userToken", "tokenResponse", "qiniuToken", "fileName", "uploadResult", "uploadResponse\\1", "fileMd5\\1", "uploadFileRequest\\1", "$i$a$-fold-GroupDiskViewModel$uploadFile$1$1\\1\\877\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "L$10", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.GroupDiskViewModel$uploadFile$1 */
    static final class C38301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $fileUri;
        final /* synthetic */ String $groupId;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38301(String str, Context context, Uri uri, Continuation<? super C38301> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$context = context;
            this.$fileUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupDiskViewModel.this.new C38301(this.$groupId, this.$context, this.$fileUri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x03f6 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x017c A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0210 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0323 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x037a A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x037f  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x03a0 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x03a5  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x03bf A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x03d9 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0045, B:71:0x031b, B:73:0x0323, B:75:0x032b, B:80:0x0339, B:81:0x0372, B:83:0x037a, B:85:0x0380, B:87:0x03a0, B:89:0x03a6, B:90:0x03be, B:10:0x0068, B:62:0x0205, B:64:0x0210, B:66:0x02ca, B:67:0x02ce, B:91:0x03bf, B:92:0x03c6, B:13:0x0088, B:39:0x0174, B:41:0x017c, B:43:0x0184, B:49:0x0191, B:51:0x0199, B:53:0x019f, B:55:0x01a5, B:58:0x01b8, B:93:0x03c7, B:94:0x03ce, B:95:0x03cf, B:97:0x03d9, B:99:0x03df, B:100:0x03f5, B:16:0x0097, B:24:0x0135, B:26:0x013c, B:32:0x0148, B:34:0x0155, B:35:0x0159, B:101:0x03f6, B:102:0x03fd, B:21:0x00d6), top: B:106:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x03de  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 1108
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.GroupDiskViewModel.C38301.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadFile(Context context, Uri fileUri, String groupId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38301(groupId, context, fileUri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFileNameFromUri(Context context, Uri uri) {
        Uri uri2;
        Exception e;
        String lastPathSegment;
        String strSubstringAfterLast$default;
        int columnIndex;
        String string = null;
        try {
            uri2 = uri;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        if (cursor2.moveToFirst() && (columnIndex = cursor2.getColumnIndex("_display_name")) >= 0) {
                            string = cursor2.getString(columnIndex);
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(cursor, null);
                    } catch (Throwable th) {
                        String str = string;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                CloseableKt.closeFinally(cursor, th);
                                throw th2;
                            } catch (Exception e2) {
                                e = e2;
                                string = str;
                                Log.w("GroupDiskUpload", "\u26a0\ufe0f \u65e0\u6cd5\u4eceContentResolver\u83b7\u53d6\u6587\u4ef6\u540d", e);
                                return string != null ? string : string;
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            uri2 = uri;
            e = e4;
        }
        if (string != null && (lastPathSegment = uri2.getLastPathSegment()) != null) {
            if (!StringsKt.contains$default((CharSequence) lastPathSegment, '/', false, 2, (Object) null)) {
                if (StringsKt.contains$default((CharSequence) lastPathSegment, ':', false, 2, (Object) null)) {
                    strSubstringAfterLast$default = StringsKt.substringAfterLast$default(lastPathSegment, ':', (String) null, 2, (Object) null);
                } else {
                    strSubstringAfterLast$default = lastPathSegment;
                }
            } else {
                strSubstringAfterLast$default = StringsKt.substringAfterLast$default(lastPathSegment, '/', (String) null, 2, (Object) null);
            }
            return strSubstringAfterLast$default;
        }
    }

    /* compiled from: GroupDiskActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.GroupDiskViewModel$renameFile$1", m185f = "GroupDiskActivity.kt", m186i = {}, m187l = {969}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.GroupDiskViewModel$renameFile$1 */
    static final class C38291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $fileId;
        final /* synthetic */ String $newName;
        final /* synthetic */ int $objectType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38291(long j, int i, String str, Continuation<? super C38291> continuation) {
            super(2, continuation);
            this.$fileId = j;
            this.$objectType = i;
            this.$newName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupDiskViewModel.this.new C38291(this.$fileId, this.$objectType, this.$newName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    DiskRepository diskRepository = GroupDiskViewModel.this.diskRepository;
                    if (diskRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskRepository");
                        diskRepository = null;
                    }
                    this.label = 1;
                    Object objM8552renameFileBWLJW6A = diskRepository.m8552renameFileBWLJW6A(this.$fileId, this.$objectType, this.$newName, this);
                    if (objM8552renameFileBWLJW6A != coroutine_suspended) {
                        value = objM8552renameFileBWLJW6A;
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
            GroupDiskViewModel groupDiskViewModel = GroupDiskViewModel.this;
            GroupDiskViewModel groupDiskViewModel2 = GroupDiskViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupDiskViewModel._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel._uiState.getValue(), false, false, null, 0L, null, true, null, 95, null));
            } else {
                groupDiskViewModel2._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel2._uiState.getValue(), false, false, null, 0L, null, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void renameFile(long fileId, int objectType, String newName) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38291(fileId, objectType, newName, null), 3, null);
    }

    /* compiled from: GroupDiskActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.GroupDiskViewModel$deleteFile$1", m185f = "GroupDiskActivity.kt", m186i = {}, m187l = {982}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.GroupDiskViewModel$deleteFile$1 */
    static final class C38271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $fileId;
        final /* synthetic */ int $objectType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38271(long j, int i, Continuation<? super C38271> continuation) {
            super(2, continuation);
            this.$fileId = j;
            this.$objectType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupDiskViewModel.this.new C38271(this.$fileId, this.$objectType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    DiskRepository diskRepository = GroupDiskViewModel.this.diskRepository;
                    if (diskRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskRepository");
                        diskRepository = null;
                    }
                    this.label = 1;
                    Object objM8551removeFile0E7RQCE = diskRepository.m8551removeFile0E7RQCE(this.$fileId, this.$objectType, this);
                    if (objM8551removeFile0E7RQCE != coroutine_suspended) {
                        value = objM8551removeFile0E7RQCE;
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
            GroupDiskViewModel groupDiskViewModel = GroupDiskViewModel.this;
            GroupDiskViewModel groupDiskViewModel2 = GroupDiskViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupDiskViewModel._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel._uiState.getValue(), false, false, null, 0L, null, true, null, 95, null));
            } else {
                groupDiskViewModel2._uiState.setValue(GroupDiskUiState.copy$default((GroupDiskUiState) groupDiskViewModel2._uiState.getValue(), false, false, null, 0L, null, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteFile(long fileId, int objectType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38271(fileId, objectType, null), 3, null);
    }

    public final void resetOperationSuccess() {
        this._uiState.setValue(GroupDiskUiState.copy$default(this._uiState.getValue(), false, false, null, 0L, null, false, null, 95, null));
    }

    public final void enterFolder(long folderId, String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        List newBreadcrumbs = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getBreadcrumbs());
        newBreadcrumbs.add(new Breadcrumb(folderId, folderName));
        this._uiState.setValue(GroupDiskUiState.copy$default(this._uiState.getValue(), false, false, null, folderId, newBreadcrumbs, false, null, 103, null));
    }

    public final void navigateToFolder(long folderId) {
        if (folderId == 0) {
            this._uiState.setValue(GroupDiskUiState.copy$default(this._uiState.getValue(), false, false, null, 0L, CollectionsKt.emptyList(), false, null, 103, null));
            return;
        }
        int breadcrumbIndex = 0;
        Iterator<Breadcrumb> it = this._uiState.getValue().getBreadcrumbs().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Breadcrumb) it.next()).getId() == folderId) {
                    break;
                } else {
                    breadcrumbIndex++;
                }
            } else {
                breadcrumbIndex = -1;
                break;
            }
        }
        if (breadcrumbIndex != -1) {
            List newBreadcrumbs = CollectionsKt.take(this._uiState.getValue().getBreadcrumbs(), breadcrumbIndex + 1);
            this._uiState.setValue(GroupDiskUiState.copy$default(this._uiState.getValue(), false, false, null, folderId, newBreadcrumbs, false, null, 103, null));
        }
    }
}
