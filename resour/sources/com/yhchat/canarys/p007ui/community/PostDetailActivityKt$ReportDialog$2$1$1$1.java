package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailActivityKt$ReportDialog$2$1$1$1", m185f = "PostDetailActivity.kt", m186i = {0, 1, 1, 2}, m187l = {1600, 1608, 1636}, m188m = "invokeSuspend", m189n = {"imageUrl", "imageUrl", "uploadToken", "imageUrl"}, m191s = {"L$0", "L$0", "L$1", "L$0"}, m192v = 1)
/* loaded from: classes14.dex */
final class PostDetailActivityKt$ReportDialog$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isReporting$delegate;
    final /* synthetic */ MutableState<Boolean> $isUploading$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function0<Unit> $onReportSuccess;
    final /* synthetic */ int $postId;
    final /* synthetic */ MutableState<String> $reportReason$delegate;
    final /* synthetic */ MutableState<Uri> $selectedImageUri$delegate;
    final /* synthetic */ String $token;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostDetailActivityKt$ReportDialog$2$1$1$1(String str, Context context, int i, Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState, MutableState<Uri> mutableState2, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, Continuation<? super PostDetailActivityKt$ReportDialog$2$1$1$1> continuation) {
        super(2, continuation);
        this.$token = str;
        this.$context = context;
        this.$postId = i;
        this.$onReportSuccess = function0;
        this.$onDismiss = function02;
        this.$isReporting$delegate = mutableState;
        this.$selectedImageUri$delegate = mutableState2;
        this.$isUploading$delegate = mutableState3;
        this.$reportReason$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostDetailActivityKt$ReportDialog$2$1$1$1(this.$token, this.$context, this.$postId, this.$onReportSuccess, this.$onDismiss, this.$isReporting$delegate, this.$selectedImageUri$delegate, this.$isUploading$delegate, this.$reportReason$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PostDetailActivityKt$ReportDialog$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[Catch: Exception -> 0x003f, all -> 0x01d8, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:31:0x0098, B:33:0x009f, B:38:0x00a9, B:41:0x00c8, B:23:0x005f, B:25:0x0069, B:28:0x0088), top: B:76:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[Catch: Exception -> 0x003f, all -> 0x01d8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:31:0x0098, B:33:0x009f, B:38:0x00a9, B:41:0x00c8, B:23:0x005f, B:25:0x0069, B:28:0x0088), top: B:76:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[Catch: Exception -> 0x0033, all -> 0x01d8, TRY_LEAVE, TryCatch #2 {all -> 0x01d8, blocks: (B:7:0x0019, B:62:0x01a5, B:64:0x01ad, B:65:0x01c5, B:70:0x01db, B:10:0x0027, B:46:0x00ef, B:48:0x00fb, B:49:0x011a, B:58:0x0180, B:52:0x0122, B:55:0x014e, B:15:0x003a, B:31:0x0098, B:33:0x009f, B:38:0x00a9, B:41:0x00c8, B:20:0x004c, B:22:0x0059, B:23:0x005f, B:25:0x0069, B:28:0x0088), top: B:76:0x000a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ad A[Catch: all -> 0x01d8, Exception -> 0x01da, TryCatch #1 {Exception -> 0x01da, blocks: (B:7:0x0019, B:62:0x01a5, B:64:0x01ad, B:65:0x01c5, B:49:0x011a, B:58:0x0180, B:55:0x014e, B:20:0x004c, B:22:0x0059), top: B:76:0x000a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c5 A[Catch: all -> 0x01d8, Exception -> 0x01da, TRY_LEAVE, TryCatch #1 {Exception -> 0x01da, blocks: (B:7:0x0019, B:62:0x01a5, B:64:0x01ad, B:65:0x01c5, B:49:0x011a, B:58:0x0180, B:55:0x014e, B:20:0x004c, B:22:0x0059), top: B:76:0x000a, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt$ReportDialog$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
