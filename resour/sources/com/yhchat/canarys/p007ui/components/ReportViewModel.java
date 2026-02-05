package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.ReportRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ReportDialog.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J:\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/ReportViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "reportRepository", "Lcom/yhchat/canarys/data/repository/ReportRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/components/ReportUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "uploadImage", "imageUri", "Landroid/net/Uri;", "submitReport", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "content", "imageUrl", "reason", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ReportViewModel extends ViewModel {
    public static final int $stable = 8;
    private ApiService apiService;
    private ReportRepository reportRepository;
    private TokenRepository tokenRepository;
    private final MutableStateFlow<ReportUiState> _uiState = StateFlowKt.MutableStateFlow(new ReportUiState(false, false, null, null, 15, null));
    private final StateFlow<ReportUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<ReportUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.reportRepository = RepositoryFactory.INSTANCE.getReportRepository(context);
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(context);
        this.apiService = RepositoryFactory.INSTANCE.getApiService();
    }

    /* compiled from: ReportDialog.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ReportViewModel$uploadImage$1", m185f = "ReportDialog.kt", m186i = {1, 2, 2, 2, 2}, m187l = {265, 275, 297}, m188m = "invokeSuspend", m189n = {"userToken", "userToken", "tokenResponse", "qiniuData", "uploadToken"}, m191s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ReportViewModel$uploadImage$1 */
    static final class C36751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $imageUri;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36751(Context context, Uri uri, Continuation<? super C36751> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$imageUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReportViewModel.this.new C36751(this.$context, this.$imageUri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0025, B:52:0x0155, B:54:0x015f, B:55:0x019c, B:10:0x0036, B:39:0x00df, B:41:0x00e7, B:44:0x00ef, B:46:0x00fe, B:48:0x0124, B:56:0x01d4, B:11:0x003e, B:22:0x0085, B:24:0x008c, B:29:0x0096, B:31:0x00bc, B:33:0x00c4, B:35:0x00cb, B:16:0x006b, B:18:0x0073, B:19:0x0079), top: B:61:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0025, B:52:0x0155, B:54:0x015f, B:55:0x019c, B:10:0x0036, B:39:0x00df, B:41:0x00e7, B:44:0x00ef, B:46:0x00fe, B:48:0x0124, B:56:0x01d4, B:11:0x003e, B:22:0x0085, B:24:0x008c, B:29:0x0096, B:31:0x00bc, B:33:0x00c4, B:35:0x00cb, B:16:0x006b, B:18:0x0073, B:19:0x0079), top: B:61:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fe A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0025, B:52:0x0155, B:54:0x015f, B:55:0x019c, B:10:0x0036, B:39:0x00df, B:41:0x00e7, B:44:0x00ef, B:46:0x00fe, B:48:0x0124, B:56:0x01d4, B:11:0x003e, B:22:0x0085, B:24:0x008c, B:29:0x0096, B:31:0x00bc, B:33:0x00c4, B:35:0x00cb, B:16:0x006b, B:18:0x0073, B:19:0x0079), top: B:61:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0124 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0025, B:52:0x0155, B:54:0x015f, B:55:0x019c, B:10:0x0036, B:39:0x00df, B:41:0x00e7, B:44:0x00ef, B:46:0x00fe, B:48:0x0124, B:56:0x01d4, B:11:0x003e, B:22:0x0085, B:24:0x008c, B:29:0x0096, B:31:0x00bc, B:33:0x00c4, B:35:0x00cb, B:16:0x006b, B:18:0x0073, B:19:0x0079), top: B:61:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x015f A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0025, B:52:0x0155, B:54:0x015f, B:55:0x019c, B:10:0x0036, B:39:0x00df, B:41:0x00e7, B:44:0x00ef, B:46:0x00fe, B:48:0x0124, B:56:0x01d4, B:11:0x003e, B:22:0x0085, B:24:0x008c, B:29:0x0096, B:31:0x00bc, B:33:0x00c4, B:35:0x00cb, B:16:0x006b, B:18:0x0073, B:19:0x0079), top: B:61:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x019c A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0025, B:52:0x0155, B:54:0x015f, B:55:0x019c, B:10:0x0036, B:39:0x00df, B:41:0x00e7, B:44:0x00ef, B:46:0x00fe, B:48:0x0124, B:56:0x01d4, B:11:0x003e, B:22:0x0085, B:24:0x008c, B:29:0x0096, B:31:0x00bc, B:33:0x00c4, B:35:0x00cb, B:16:0x006b, B:18:0x0073, B:19:0x0079), top: B:61:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 598
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ReportViewModel.C36751.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadImage(Context context, Uri imageUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36751(context, imageUri, null), 3, null);
    }

    public static /* synthetic */ void submitReport$default(ReportViewModel reportViewModel, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str4 = "";
        }
        if ((i2 & 32) != 0) {
            str5 = "";
        }
        reportViewModel.submitReport(str, i, str2, str3, str4, str5);
    }

    /* compiled from: ReportDialog.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ReportViewModel$submitReport$1", m185f = "ReportDialog.kt", m186i = {}, m187l = {332}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ReportViewModel$submitReport$1 */
    static final class C36741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ String $chatName;
        final /* synthetic */ int $chatType;
        final /* synthetic */ String $content;
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ String $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36741(String str, int i, String str2, String str3, String str4, String str5, Continuation<? super C36741> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
            this.$chatName = str2;
            this.$content = str3;
            this.$imageUrl = str4;
            this.$reason = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReportViewModel.this.new C36741(this.$chatId, this.$chatType, this.$chatName, this.$content, this.$imageUrl, this.$reason, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ReportViewModel.this._uiState.setValue(ReportUiState.copy$default((ReportUiState) ReportViewModel.this._uiState.getValue(), true, false, null, null, 6, null));
                    ReportRepository reportRepository = ReportViewModel.this.reportRepository;
                    if (reportRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("reportRepository");
                        reportRepository = null;
                    }
                    this.label = 1;
                    Object objM8624submitReportbMdYcbs = reportRepository.m8624submitReportbMdYcbs(this.$chatId, this.$chatType, this.$chatName, this.$content, this.$imageUrl, this.$reason, this);
                    if (objM8624submitReportbMdYcbs == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8624submitReportbMdYcbs;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ReportViewModel reportViewModel = ReportViewModel.this;
            ReportViewModel reportViewModel2 = ReportViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                reportViewModel._uiState.setValue(ReportUiState.copy$default((ReportUiState) reportViewModel._uiState.getValue(), false, true, null, null, 12, null));
            } else {
                reportViewModel2._uiState.setValue(ReportUiState.copy$default((ReportUiState) reportViewModel2._uiState.getValue(), false, false, null, thM11922exceptionOrNullimpl.getMessage(), 6, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void submitReport(String chatId, int chatType, String chatName, String content, String imageUrl, String reason) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36741(chatId, chatType, chatName, content, imageUrl, reason, null), 3, null);
    }
}
