package com.yhchat.canarys.service;

import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FileDownloadService.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$finalFile$2", m185f = "FileDownloadService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes13.dex */
final class FileDownloadService$startDownloadFile$1$finalFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fileName;
    final /* synthetic */ File $targetFile;
    int label;
    final /* synthetic */ FileDownloadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileDownloadService$startDownloadFile$1$finalFile$2(FileDownloadService fileDownloadService, String str, File file, Continuation<? super FileDownloadService$startDownloadFile$1$finalFile$2> continuation) {
        super(2, continuation);
        this.this$0 = fileDownloadService;
        this.$fileName = str;
        this.$targetFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileDownloadService$startDownloadFile$1$finalFile$2(this.this$0, this.$fileName, this.$targetFile, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileDownloadService$startDownloadFile$1$finalFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.this$0.updateNotification(this.$fileName, "\u4e0b\u8f7d\u5b8c\u6210 - " + this.$targetFile.getName(), 100, 100, true);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
