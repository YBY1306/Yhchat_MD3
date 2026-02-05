package com.yhchat.canarys.p007ui.settings;

import android.content.ContentResolver;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1$needsUserGrant$1", m185f = "SavedAudiosActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* renamed from: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1$needsUserGrant$1 */
/* loaded from: classes8.dex */
final class C4197xf549a502 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ List<Long> $mediaStoreIds;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4197xf549a502(ContentResolver contentResolver, List<Long> list, Continuation<? super C4197xf549a502> continuation) {
        super(2, continuation);
        this.$resolver = contentResolver;
        this.$mediaStoreIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C4197xf549a502 c4197xf549a502 = new C4197xf549a502(this.$resolver, this.$mediaStoreIds, continuation);
        c4197xf549a502.L$0 = obj;
        return c4197xf549a502;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((C4197xf549a502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM11919constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ContentResolver contentResolver = this.$resolver;
                List<Long> list = this.$mediaStoreIds;
                boolean z = false;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intrinsics.checkNotNull(contentResolver);
                    SavedAudiosActivityKt.deleteAudiosByIds(contentResolver, list);
                    objM11919constructorimpl = Result.m11919constructorimpl(Boxing.boxBoolean(false));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM11919constructorimpl = Result.m11919constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(objM11919constructorimpl);
                if (thM11922exceptionOrNullimpl != null) {
                    if ((thM11922exceptionOrNullimpl instanceof SecurityException) && Build.VERSION.SDK_INT >= 30) {
                        z = true;
                    }
                    return Boxing.boxBoolean(z);
                }
                return objM11919constructorimpl;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
