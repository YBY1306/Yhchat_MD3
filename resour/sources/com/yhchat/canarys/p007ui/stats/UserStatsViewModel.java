package com.yhchat.canarys.p007ui.stats;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.api.ApiService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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

/* compiled from: UserStatsViewModel.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/ui/stats/UserStatsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/stats/UserStatsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "loadUserStats", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class UserStatsViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<UserStatsUiState> _uiState;
    private final ApiService apiService;
    private final StateFlow<UserStatsUiState> uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatsViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this._uiState = StateFlowKt.MutableStateFlow(new UserStatsUiState(false, null, null, 7, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this.apiService = ApiClient.INSTANCE.getApiService();
    }

    public final StateFlow<UserStatsUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: UserStatsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.stats.UserStatsViewModel$loadUserStats$1", m185f = "UserStatsViewModel.kt", m186i = {0, 0, 1, 1, 1}, m187l = {39, 49}, m188m = "invokeSuspend", m189n = {"context", "tokenRepository", "context", "tokenRepository", "token"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.stats.UserStatsViewModel$loadUserStats$1 */
    static final class C42111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C42111(Continuation<? super C42111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserStatsViewModel.this.new C42111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[Catch: Exception -> 0x018c, TryCatch #0 {Exception -> 0x018c, blocks: (B:7:0x0022, B:35:0x00f1, B:37:0x00f9, B:39:0x0101, B:41:0x0107, B:42:0x0128, B:44:0x013f, B:47:0x0147, B:48:0x0154, B:10:0x0031, B:17:0x008b, B:19:0x008f, B:21:0x0095, B:23:0x009a, B:29:0x00a6, B:31:0x00cb, B:13:0x005d), top: B:54:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[Catch: Exception -> 0x018c, TryCatch #0 {Exception -> 0x018c, blocks: (B:7:0x0022, B:35:0x00f1, B:37:0x00f9, B:39:0x0101, B:41:0x0107, B:42:0x0128, B:44:0x013f, B:47:0x0147, B:48:0x0154, B:10:0x0031, B:17:0x008b, B:19:0x008f, B:21:0x0095, B:23:0x009a, B:29:0x00a6, B:31:0x00cb, B:13:0x005d), top: B:54:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[Catch: Exception -> 0x018c, TryCatch #0 {Exception -> 0x018c, blocks: (B:7:0x0022, B:35:0x00f1, B:37:0x00f9, B:39:0x0101, B:41:0x0107, B:42:0x0128, B:44:0x013f, B:47:0x0147, B:48:0x0154, B:10:0x0031, B:17:0x008b, B:19:0x008f, B:21:0x0095, B:23:0x009a, B:29:0x00a6, B:31:0x00cb, B:13:0x005d), top: B:54:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f9 A[Catch: Exception -> 0x018c, TryCatch #0 {Exception -> 0x018c, blocks: (B:7:0x0022, B:35:0x00f1, B:37:0x00f9, B:39:0x0101, B:41:0x0107, B:42:0x0128, B:44:0x013f, B:47:0x0147, B:48:0x0154, B:10:0x0031, B:17:0x008b, B:19:0x008f, B:21:0x0095, B:23:0x009a, B:29:0x00a6, B:31:0x00cb, B:13:0x005d), top: B:54:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0154 A[Catch: Exception -> 0x018c, TRY_LEAVE, TryCatch #0 {Exception -> 0x018c, blocks: (B:7:0x0022, B:35:0x00f1, B:37:0x00f9, B:39:0x0101, B:41:0x0107, B:42:0x0128, B:44:0x013f, B:47:0x0147, B:48:0x0154, B:10:0x0031, B:17:0x008b, B:19:0x008f, B:21:0x0095, B:23:0x009a, B:29:0x00a6, B:31:0x00cb, B:13:0x005d), top: B:54:0x000b }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 466
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.stats.UserStatsViewModel.C42111.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadUserStats() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42111(null), 3, null);
    }
}
