package com.yhchat.canarys.p007ui.disk.webdav;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebDAVSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$WebDAVSettingsScreen$2$1", m185f = "WebDAVSettingsActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes7.dex */
final class WebDAVSettingsActivityKt$WebDAVSettingsScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<WebDAVSettingsUiState> $uiState$delegate;
    final /* synthetic */ WebDAVSettingsViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebDAVSettingsActivityKt$WebDAVSettingsScreen$2$1(State<WebDAVSettingsUiState> state, Context context, WebDAVSettingsViewModel webDAVSettingsViewModel, Continuation<? super WebDAVSettingsActivityKt$WebDAVSettingsScreen$2$1> continuation) {
        super(2, continuation);
        this.$uiState$delegate = state;
        this.$context = context;
        this.$viewModel = webDAVSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebDAVSettingsActivityKt$WebDAVSettingsScreen$2$1(this.$uiState$delegate, this.$context, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebDAVSettingsActivityKt$WebDAVSettingsScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String error = WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$1(this.$uiState$delegate).getError();
                if (error != null) {
                    Context context = this.$context;
                    WebDAVSettingsViewModel webDAVSettingsViewModel = this.$viewModel;
                    Toast.makeText(context, error, 0).show();
                    webDAVSettingsViewModel.clearError();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
