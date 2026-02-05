package com.yhchat.canarys.p007ui.disk.webdav;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.MountSetting;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.TokenRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
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

/* compiled from: WebDAVBrowserActivity.kt */
@Metadata(m168d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/WebDAVBrowserViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/disk/webdav/WebDAVBrowserUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadMountSettings", "groupId", "", "selectMount", "index", "", "loadFiles", "mountSetting", "Lcom/yhchat/canarys/data/model/MountSetting;", "path", "enterFolder", "relativePath", "navigateToPath", "targetPath", "navigateUp", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class WebDAVBrowserViewModel extends ViewModel {
    public static final int $stable = 8;
    private ApiService apiService;
    private TokenRepository tokenRepository;
    private final MutableStateFlow<WebDAVBrowserUiState> _uiState = StateFlowKt.MutableStateFlow(new WebDAVBrowserUiState(false, false, null, 0, null, null, null, null, 255, null));
    private final StateFlow<WebDAVBrowserUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<WebDAVBrowserUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.apiService = ApiClient.INSTANCE.getApiService();
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(context);
    }

    /* compiled from: WebDAVBrowserActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserViewModel$loadMountSettings$1", m185f = "WebDAVBrowserActivity.kt", m186i = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m187l = {563, 575, 591, 600}, m188m = "invokeSuspend", m189n = {"encryptionResult", "encryptKey", "encryptIv", "rawKeyPair", "encryptionResult", "encryptKey", "encryptIv", "rawKeyPair", "userToken", "request", "encryptionResult", "encryptKey", "encryptIv", "rawKeyPair", "userToken", "request", "response", "encryptedMountSettings", "decryptedMountSettings", "mountSetting"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserViewModel$loadMountSettings$1 */
    static final class C38581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
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
        C38581(String str, Continuation<? super C38581> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVBrowserViewModel.this.new C38581(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:82|145|83|(1:85)(1:86)|87|133|88|89|141|73|(11:104|150|105|(1:107)(1:108)|109|135|110|(1:112)|113|130|131)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(9:152|75|76|143|77|78|139|79|(1:81)(11:82|145|83|(1:85)(1:86)|87|133|88|89|141|73|(11:104|150|105|(1:107)(1:108)|109|135|110|(1:112)|113|130|131)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x033f, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0340, code lost:
        
            r12 = r13;
            r2 = r35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x034b, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x034c, code lost:
        
            r2 = r35;
            r27 = r22;
            r28 = r23;
            r29 = r24;
            r30 = r25;
            r31 = r26;
            r22 = r7;
            r23 = r9;
            r24 = r10;
            r7 = r0;
            r25 = r20;
            r26 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0364, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0365, code lost:
        
            r27 = r22;
            r28 = r23;
            r29 = r24;
            r30 = r25;
            r31 = r26;
            r22 = r7;
            r23 = r9;
            r24 = r10;
            r7 = r0;
            r25 = r20;
            r26 = r21;
         */
        /* JADX WARN: Path cross not found for [B:38:0x0188, B:42:0x0191], limit reached: 152 */
        /* JADX WARN: Removed duplicated region for block: B:104:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x046f  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0117 A[Catch: Exception -> 0x00d2, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x00d2, blocks: (B:12:0x00a7, B:59:0x021f, B:66:0x0231, B:68:0x0237, B:15:0x00c0, B:38:0x0188, B:44:0x0194, B:48:0x01d6, B:16:0x00cc, B:26:0x0117, B:30:0x015d), top: B:149:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0143 A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:55:0x020f, B:57:0x0217, B:64:0x0229, B:71:0x0241, B:70:0x023d, B:120:0x044c, B:122:0x0469, B:125:0x0471, B:36:0x0181, B:46:0x01c5, B:51:0x01dd, B:24:0x0113, B:28:0x0143, B:32:0x0163, B:21:0x0105), top: B:132:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0194 A[Catch: Exception -> 0x00d2, TRY_LEAVE, TryCatch #9 {Exception -> 0x00d2, blocks: (B:12:0x00a7, B:59:0x021f, B:66:0x0231, B:68:0x0237, B:15:0x00c0, B:38:0x0188, B:44:0x0194, B:48:0x01d6, B:16:0x00cc, B:26:0x0117, B:30:0x015d), top: B:149:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01c5 A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:55:0x020f, B:57:0x0217, B:64:0x0229, B:71:0x0241, B:70:0x023d, B:120:0x044c, B:122:0x0469, B:125:0x0471, B:36:0x0181, B:46:0x01c5, B:51:0x01dd, B:24:0x0113, B:28:0x0143, B:32:0x0163, B:21:0x0105), top: B:132:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0217 A[Catch: Exception -> 0x048f, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:55:0x020f, B:57:0x0217, B:64:0x0229, B:71:0x0241, B:70:0x023d, B:120:0x044c, B:122:0x0469, B:125:0x0471, B:36:0x0181, B:46:0x01c5, B:51:0x01dd, B:24:0x0113, B:28:0x0143, B:32:0x0163, B:21:0x0105), top: B:132:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02dc  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x02c1 -> B:145:0x02d8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x03c5 -> B:141:0x0260). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 1262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserViewModel.C38581.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadMountSettings(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38581(groupId, null), 3, null);
    }

    public final void selectMount(int index) {
        boolean z = false;
        if (index >= 0 && index < this._uiState.getValue().getMountSettings().size()) {
            z = true;
        }
        if (z) {
            MountSetting selectedMount = this._uiState.getValue().getMountSettings().get(index);
            this._uiState.setValue(WebDAVBrowserUiState.copy$default(this._uiState.getValue(), false, false, null, index, null, null, null, null, 247, null));
            MountState mountState = this._uiState.getValue().getMountStates().get(Integer.valueOf(index));
            if (mountState == null) {
                loadFiles(selectedMount, "");
            }
        }
    }

    /* compiled from: WebDAVBrowserActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserViewModel$loadFiles$1", m185f = "WebDAVBrowserActivity.kt", m186i = {0, 0}, m187l = {679}, m188m = "invokeSuspend", m189n = {"currentMountStates", "mountIndex"}, m191s = {"L$0", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserViewModel$loadFiles$1 */
    static final class C38571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MountSetting $mountSetting;
        final /* synthetic */ String $path;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38571(MountSetting mountSetting, String str, Continuation<? super C38571> continuation) {
            super(2, continuation);
            this.$mountSetting = mountSetting;
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVBrowserViewModel.this.new C38571(this.$mountSetting, this.$path, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0163  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserViewModel.C38571.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ void loadFiles$default(WebDAVBrowserViewModel webDAVBrowserViewModel, MountSetting mountSetting, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        webDAVBrowserViewModel.loadFiles(mountSetting, str);
    }

    public final void loadFiles(MountSetting mountSetting, String path) {
        Intrinsics.checkNotNullParameter(mountSetting, "mountSetting");
        Intrinsics.checkNotNullParameter(path, "path");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38571(mountSetting, path, null), 3, null);
    }

    public final void enterFolder(String relativePath) {
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        MountSetting selectedMount = (MountSetting) CollectionsKt.getOrNull(this._uiState.getValue().getMountSettings(), this._uiState.getValue().getSelectedMountIndex());
        if (selectedMount != null) {
            Log.d("WebDAVBrowser", "enterFolder: relativePath=" + relativePath);
            loadFiles(selectedMount, relativePath);
        }
    }

    public final void navigateToPath(String targetPath) {
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        MountSetting selectedMount = (MountSetting) CollectionsKt.getOrNull(this._uiState.getValue().getMountSettings(), this._uiState.getValue().getSelectedMountIndex());
        if (selectedMount != null) {
            loadFiles(selectedMount, targetPath);
        }
    }

    public final boolean navigateUp() {
        int selectedIndex = this._uiState.getValue().getSelectedMountIndex();
        MountState mountState = this._uiState.getValue().getMountStates().get(Integer.valueOf(selectedIndex));
        if (mountState == null) {
            return false;
        }
        String currentPath = mountState.getCurrentPath();
        if (StringsKt.isBlank(currentPath)) {
            return false;
        }
        String parentPath = StringsKt.substringBeforeLast(currentPath, '/', "");
        MountSetting selectedMount = (MountSetting) CollectionsKt.getOrNull(this._uiState.getValue().getMountSettings(), selectedIndex);
        if (selectedMount == null) {
            return false;
        }
        loadFiles(selectedMount, parentPath);
        return true;
    }
}
