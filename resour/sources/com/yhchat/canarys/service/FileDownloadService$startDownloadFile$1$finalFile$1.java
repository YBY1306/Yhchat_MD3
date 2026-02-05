package com.yhchat.canarys.service;

import android.widget.Toast;
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
@DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$finalFile$1", m185f = "FileDownloadService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes13.dex */
final class FileDownloadService$startDownloadFile$1$finalFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $existingFile;
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ FileDownloadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileDownloadService$startDownloadFile$1$finalFile$1(FileDownloadService fileDownloadService, String str, File file, Continuation<? super FileDownloadService$startDownloadFile$1$finalFile$1> continuation) {
        super(2, continuation);
        this.this$0 = fileDownloadService;
        this.$fileName = str;
        this.$existingFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileDownloadService$startDownloadFile$1$finalFile$1(this.this$0, this.$fileName, this.$existingFile, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileDownloadService$startDownloadFile$1$finalFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Toast.makeText(this.this$0, "\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u76f4\u63a5\u6253\u5f00", 0).show();
                this.this$0.updateNotification(this.$fileName, "\u6587\u4ef6\u5df2\u5b58\u5728 - " + this.$existingFile.getName(), 100, 100, true);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
