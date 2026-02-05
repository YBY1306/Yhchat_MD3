package com.yhchat.canarys.p007ui.disk.webdav;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: WebDAVSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012J%\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u0014J\u0006\u0010\"\u001a\u00020\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0012H\u0082@\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/WebDAVSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/disk/webdav/WebDAVSettingsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentUserId", "", "init", "", "context", "Landroid/content/Context;", "loadMountSettings", "groupId", "saveMountSetting", "form", "Lcom/yhchat/canarys/ui/disk/webdav/MountFormState;", "editingId", "", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/disk/webdav/MountFormState;Ljava/lang/Long;)V", "deleteMountSetting", "mountId", "clearError", "clearSuccessMessage", "getCurrentUserId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
final class WebDAVSettingsViewModel extends ViewModel {
    private ApiService apiService;
    private String currentUserId;
    private TokenRepository tokenRepository;
    private UserRepository userRepository;
    private final MutableStateFlow<WebDAVSettingsUiState> _uiState = StateFlowKt.MutableStateFlow(new WebDAVSettingsUiState(false, false, null, null, null, 31, null));
    private final StateFlow<WebDAVSettingsUiState> uiState = FlowKt.asStateFlow(this._uiState);

    /* compiled from: WebDAVSettingsActivity.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel", m185f = "WebDAVSettingsActivity.kt", m186i = {}, m187l = {487}, m188m = "getCurrentUserId", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$getCurrentUserId$1 */
    static final class C38681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C38681(Continuation<? super C38681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebDAVSettingsViewModel.this.getCurrentUserId(this);
        }
    }

    public final StateFlow<WebDAVSettingsUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.apiService = ApiClient.INSTANCE.getApiService();
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(context);
        ApiService apiService = ApiClient.INSTANCE.getApiService();
        TokenRepository tokenRepository = this.tokenRepository;
        if (tokenRepository == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tokenRepository");
            tokenRepository = null;
        }
        this.userRepository = new UserRepository(apiService, tokenRepository);
    }

    /* compiled from: WebDAVSettingsActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$loadMountSettings$1", m185f = "WebDAVSettingsActivity.kt", m186i = {1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4}, m187l = {384, 387, 388, 395, 402}, m188m = "invokeSuspend", m189n = {"encryptionResult", "encryptKey", "encryptIv", "rawKeyPair", "encryptionResult", "encryptKey", "encryptIv", "rawKeyPair", "token", "encryptionResult", "encryptKey", "encryptIv", "rawKeyPair", "token", "response", "encryptedList", "$this$map\\1", "$this$mapTo\\2", "destination\\2", "item\\2", "item\\3", "$i$f$map\\1\\394", "$i$f$mapTo\\2\\493", "$i$a$-map-WebDAVSettingsViewModel$loadMountSettings$1$decryptedList$1\\3\\495\\0", "encryptionResult", "encryptKey", "encryptIv", "rawKeyPair", "token", "response", "encryptedList", "decryptedList"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "L$12", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$loadMountSettings$1 */
    static final class C38691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
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
        C38691(String str, Continuation<? super C38691> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVSettingsViewModel.this.new C38691(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x03b6  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x03bc A[Catch: Exception -> 0x03cc, TryCatch #0 {Exception -> 0x03cc, blocks: (B:46:0x019c, B:48:0x01a4, B:57:0x01b9, B:64:0x01d1, B:63:0x01cd, B:106:0x03a6, B:108:0x03b0, B:111:0x03b8, B:112:0x03bb, B:35:0x0156, B:37:0x015a, B:42:0x0169, B:113:0x03bc, B:114:0x03c3, B:25:0x0114, B:27:0x0118, B:31:0x0138, B:115:0x03c4, B:116:0x03cb, B:22:0x0105), top: B:122:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x03c4 A[Catch: Exception -> 0x03cc, TryCatch #0 {Exception -> 0x03cc, blocks: (B:46:0x019c, B:48:0x01a4, B:57:0x01b9, B:64:0x01d1, B:63:0x01cd, B:106:0x03a6, B:108:0x03b0, B:111:0x03b8, B:112:0x03bb, B:35:0x0156, B:37:0x015a, B:42:0x0169, B:113:0x03bc, B:114:0x03c3, B:25:0x0114, B:27:0x0118, B:31:0x0138, B:115:0x03c4, B:116:0x03cb, B:22:0x0105), top: B:122:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0118 A[Catch: Exception -> 0x03cc, TRY_LEAVE, TryCatch #0 {Exception -> 0x03cc, blocks: (B:46:0x019c, B:48:0x01a4, B:57:0x01b9, B:64:0x01d1, B:63:0x01cd, B:106:0x03a6, B:108:0x03b0, B:111:0x03b8, B:112:0x03bb, B:35:0x0156, B:37:0x015a, B:42:0x0169, B:113:0x03bc, B:114:0x03c3, B:25:0x0114, B:27:0x0118, B:31:0x0138, B:115:0x03c4, B:116:0x03cb, B:22:0x0105), top: B:122:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x015a A[Catch: Exception -> 0x03cc, TRY_LEAVE, TryCatch #0 {Exception -> 0x03cc, blocks: (B:46:0x019c, B:48:0x01a4, B:57:0x01b9, B:64:0x01d1, B:63:0x01cd, B:106:0x03a6, B:108:0x03b0, B:111:0x03b8, B:112:0x03bb, B:35:0x0156, B:37:0x015a, B:42:0x0169, B:113:0x03bc, B:114:0x03c3, B:25:0x0114, B:27:0x0118, B:31:0x0138, B:115:0x03c4, B:116:0x03cb, B:22:0x0105), top: B:122:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01a4 A[Catch: Exception -> 0x03cc, TRY_LEAVE, TryCatch #0 {Exception -> 0x03cc, blocks: (B:46:0x019c, B:48:0x01a4, B:57:0x01b9, B:64:0x01d1, B:63:0x01cd, B:106:0x03a6, B:108:0x03b0, B:111:0x03b8, B:112:0x03bb, B:35:0x0156, B:37:0x015a, B:42:0x0169, B:113:0x03bc, B:114:0x03c3, B:25:0x0114, B:27:0x0118, B:31:0x0138, B:115:0x03c4, B:116:0x03cb, B:22:0x0105), top: B:122:0x0105 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01fe A[Catch: Exception -> 0x03a2, TRY_LEAVE, TryCatch #3 {Exception -> 0x03a2, blocks: (B:66:0x01f8, B:68:0x01fe), top: B:126:0x01f8 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0294  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02c9 A[Catch: Exception -> 0x02c6, TryCatch #2 {Exception -> 0x02c6, blocks: (B:85:0x0329, B:87:0x0330, B:102:0x0378, B:94:0x033f, B:95:0x0350, B:97:0x0356, B:99:0x036c, B:101:0x0372, B:74:0x0290, B:78:0x029b, B:70:0x020b, B:81:0x02c9), top: B:124:0x0290 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0339  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x033c  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x033f A[Catch: Exception -> 0x02c6, TryCatch #2 {Exception -> 0x02c6, blocks: (B:85:0x0329, B:87:0x0330, B:102:0x0378, B:94:0x033f, B:95:0x0350, B:97:0x0356, B:99:0x036c, B:101:0x0372, B:74:0x0290, B:78:0x029b, B:70:0x020b, B:81:0x02c9), top: B:124:0x0290 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x027d -> B:124:0x0290). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r40) {
            /*
                Method dump skipped, instructions count: 1034
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsViewModel.C38691.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadMountSettings(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38691(groupId, null), 3, null);
    }

    /* compiled from: WebDAVSettingsActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$saveMountSetting$1", m185f = "WebDAVSettingsActivity.kt", m186i = {1, 2}, m187l = {422, 425, 428}, m188m = "invokeSuspend", m189n = {"token", "token"}, m191s = {"L$0", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$saveMountSetting$1 */
    static final class C38701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $editingId;
        final /* synthetic */ MountFormState $form;
        final /* synthetic */ String $groupId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38701(Long l, String str, MountFormState mountFormState, Continuation<? super C38701> continuation) {
            super(2, continuation);
            this.$editingId = l;
            this.$groupId = str;
            this.$form = mountFormState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVSettingsViewModel.this.new C38701(this.$editingId, this.$groupId, this.$form, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0019, B:41:0x00e6, B:43:0x00ee, B:45:0x00f7, B:50:0x0101, B:54:0x011d, B:55:0x0138, B:57:0x0142, B:60:0x014a, B:61:0x014d, B:10:0x0023, B:33:0x009f, B:35:0x00a7, B:37:0x00ac, B:11:0x0028, B:22:0x0070, B:24:0x0074, B:26:0x0078, B:28:0x0080, B:29:0x0084, B:62:0x014e, B:63:0x0155, B:16:0x0056, B:18:0x005e, B:19:0x0064), top: B:67:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0019, B:41:0x00e6, B:43:0x00ee, B:45:0x00f7, B:50:0x0101, B:54:0x011d, B:55:0x0138, B:57:0x0142, B:60:0x014a, B:61:0x014d, B:10:0x0023, B:33:0x009f, B:35:0x00a7, B:37:0x00ac, B:11:0x0028, B:22:0x0070, B:24:0x0074, B:26:0x0078, B:28:0x0080, B:29:0x0084, B:62:0x014e, B:63:0x0155, B:16:0x0056, B:18:0x005e, B:19:0x0064), top: B:67:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0019, B:41:0x00e6, B:43:0x00ee, B:45:0x00f7, B:50:0x0101, B:54:0x011d, B:55:0x0138, B:57:0x0142, B:60:0x014a, B:61:0x014d, B:10:0x0023, B:33:0x009f, B:35:0x00a7, B:37:0x00ac, B:11:0x0028, B:22:0x0070, B:24:0x0074, B:26:0x0078, B:28:0x0080, B:29:0x0084, B:62:0x014e, B:63:0x0155, B:16:0x0056, B:18:0x005e, B:19:0x0064), top: B:67:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x014e A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0019, B:41:0x00e6, B:43:0x00ee, B:45:0x00f7, B:50:0x0101, B:54:0x011d, B:55:0x0138, B:57:0x0142, B:60:0x014a, B:61:0x014d, B:10:0x0023, B:33:0x009f, B:35:0x00a7, B:37:0x00ac, B:11:0x0028, B:22:0x0070, B:24:0x0074, B:26:0x0078, B:28:0x0080, B:29:0x0084, B:62:0x014e, B:63:0x0155, B:16:0x0056, B:18:0x005e, B:19:0x0064), top: B:67:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsViewModel.C38701.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void saveMountSetting(String groupId, MountFormState form, Long editingId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(form, "form");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38701(editingId, groupId, form, null), 3, null);
    }

    /* compiled from: WebDAVSettingsActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$deleteMountSetting$1", m185f = "WebDAVSettingsActivity.kt", m186i = {1}, m187l = {459, 460}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$deleteMountSetting$1 */
    static final class C38671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ long $mountId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38671(long j, String str, Continuation<? super C38671> continuation) {
            super(2, continuation);
            this.$mountId = j;
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDAVSettingsViewModel.this.new C38671(this.$mountId, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x0017, B:29:0x0070, B:31:0x0078, B:33:0x0081, B:38:0x008b, B:39:0x00b6, B:41:0x00c0, B:44:0x00c8, B:45:0x00cb, B:8:0x001c, B:19:0x0042, B:21:0x0046, B:23:0x004e, B:25:0x0055, B:46:0x00cc, B:47:0x00d3, B:13:0x0028, B:15:0x0030, B:16:0x0036), top: B:51:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x0017, B:29:0x0070, B:31:0x0078, B:33:0x0081, B:38:0x008b, B:39:0x00b6, B:41:0x00c0, B:44:0x00c8, B:45:0x00cb, B:8:0x001c, B:19:0x0042, B:21:0x0046, B:23:0x004e, B:25:0x0055, B:46:0x00cc, B:47:0x00d3, B:13:0x0028, B:15:0x0030, B:16:0x0036), top: B:51:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x0017, B:29:0x0070, B:31:0x0078, B:33:0x0081, B:38:0x008b, B:39:0x00b6, B:41:0x00c0, B:44:0x00c8, B:45:0x00cb, B:8:0x001c, B:19:0x0042, B:21:0x0046, B:23:0x004e, B:25:0x0055, B:46:0x00cc, B:47:0x00d3, B:13:0x0028, B:15:0x0030, B:16:0x0036), top: B:51:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsViewModel.C38671.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void deleteMountSetting(String groupId, long mountId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38671(mountId, groupId, null), 3, null);
    }

    public final void clearError() {
        this._uiState.setValue(WebDAVSettingsUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, 23, null));
    }

    public final void clearSuccessMessage() {
        this._uiState.setValue(WebDAVSettingsUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, 15, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCurrentUserId(kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsViewModel.C38681
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$getCurrentUserId$1 r0 = (com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsViewModel.C38681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$getCurrentUserId$1 r0 = new com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsViewModel$getCurrentUserId$1
            r0.<init>(r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 0
            switch(r3) {
                case 0: goto L38;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            kotlin.ResultKt.throwOnFailure(r1)
            r2 = r1
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.getValue()
            goto L79
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r3 = r8.currentUserId
            if (r3 == 0) goto L41
            r2 = 0
            return r3
        L41:
            com.yhchat.canarys.data.repository.TokenRepository r3 = r8.tokenRepository
            if (r3 != 0) goto L4b
            java.lang.String r3 = "tokenRepository"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = r4
        L4b:
            java.lang.String r3 = r3.getUserIdSync()
            if (r3 == 0) goto L64
            r5 = r3
            r6 = 0
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = kotlin.text.StringsKt.isBlank(r7)
            if (r7 != 0) goto L5d
            goto L5e
        L5d:
            r3 = r4
        L5e:
            if (r3 == 0) goto L64
            r2 = 0
            r8.currentUserId = r3
            return r3
        L64:
            com.yhchat.canarys.data.repository.UserRepository r3 = r8.userRepository
            if (r3 != 0) goto L6e
            java.lang.String r3 = "userRepository"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = r4
        L6e:
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = r3.m8657getUserProfileIoAF18A(r0)
            if (r3 != r2) goto L78
            return r2
        L78:
            r2 = r3
        L79:
            boolean r3 = kotlin.Result.m11925isFailureimpl(r2)
            if (r3 == 0) goto L80
            r2 = r4
        L80:
            com.yhchat.canarys.data.model.UserProfile r2 = (com.yhchat.canarys.data.model.UserProfile) r2
            if (r2 == 0) goto L90
            java.lang.String r2 = r2.getUserId()
            if (r2 == 0) goto L90
            r3 = r2
            r4 = 0
            r8.currentUserId = r3
            r4 = r2
        L90:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsViewModel.getCurrentUserId(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
