package com.yhchat.canarys.p007ui.settings;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$intentSenderLauncher$1$1$1", m185f = "SavedAudiosActivity.kt", m186i = {}, m187l = {329}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* renamed from: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$intentSenderLauncher$1$1$1 */
/* loaded from: classes8.dex */
final class C4200x4e7f3fd4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Uri> $grantedTreeUri$delegate;
    final /* synthetic */ MutableState<List<SavedAudioUiItem>> $items$delegate;
    final /* synthetic */ MutableState<Boolean> $multiSelectionMode$delegate;
    final /* synthetic */ ContentResolver $resolver;
    final /* synthetic */ SnapshotStateList<Long> $selectedIds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4200x4e7f3fd4(ContentResolver contentResolver, Context context, SnapshotStateList<Long> snapshotStateList, MutableState<Uri> mutableState, MutableState<List<SavedAudioUiItem>> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super C4200x4e7f3fd4> continuation) {
        super(2, continuation);
        this.$resolver = contentResolver;
        this.$context = context;
        this.$selectedIds = snapshotStateList;
        this.$grantedTreeUri$delegate = mutableState;
        this.$items$delegate = mutableState2;
        this.$multiSelectionMode$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C4200x4e7f3fd4(this.$resolver, this.$context, this.$selectedIds, this.$grantedTreeUri$delegate, this.$items$delegate, this.$multiSelectionMode$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C4200x4e7f3fd4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (SavedAudiosActivityKt.SavedAudiosScreen$reload(this.$resolver, this.$context, this.$selectedIds, this.$grantedTreeUri$delegate, this.$items$delegate, this.$multiSelectionMode$delegate, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
