package com.yhchat.canarys.service;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FileDownloadService.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$downloadFileWithProgress$2$1$1$2", m185f = "FileDownloadService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes13.dex */
final class FileDownloadService$downloadFileWithProgress$2$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $downloadedBytes;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $progress;
    final /* synthetic */ int $total;
    final /* synthetic */ long $totalBytes;
    int label;
    final /* synthetic */ FileDownloadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileDownloadService$downloadFileWithProgress$2$1$1$2(int i, Ref.LongRef longRef, long j, FileDownloadService fileDownloadService, String str, int i2, Continuation<? super FileDownloadService$downloadFileWithProgress$2$1$1$2> continuation) {
        super(2, continuation);
        this.$total = i;
        this.$downloadedBytes = longRef;
        this.$totalBytes = j;
        this.this$0 = fileDownloadService;
        this.$fileName = str;
        this.$progress = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileDownloadService$downloadFileWithProgress$2$1$1$2(this.$total, this.$downloadedBytes, this.$totalBytes, this.this$0, this.$fileName, this.$progress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileDownloadService$downloadFileWithProgress$2$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$total <= 0) {
                    str = "\u4e0b\u8f7d\u4e2d... " + this.this$0.formatFileSize(this.$downloadedBytes.element);
                } else {
                    int percentage = (int) ((this.$downloadedBytes.element * 100) / this.$totalBytes);
                    str = "\u4e0b\u8f7d\u4e2d... " + percentage + "% (" + this.this$0.formatFileSize(this.$downloadedBytes.element) + "/" + this.this$0.formatFileSize(this.$totalBytes) + ")";
                }
                String progressText = str;
                FileDownloadService.updateNotification$default(this.this$0, this.$fileName, progressText, this.$progress, this.$total, false, 16, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
