package com.yhchat.canarys.p007ui.settings;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1", m185f = "SavedAudiosActivity.kt", m186i = {0, 1, 2, 2}, m187l = {598, 601, 617}, m188m = "invokeSuspend", m189n = {"mediaStoreIds", "mediaStoreIds", "mediaStoreIds", "needsUserGrant"}, m191s = {"L$0", "L$0", "L$0", "Z$0"}, m192v = 1)
/* loaded from: classes8.dex */
final class SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Uri> $grantedTreeUri$delegate;
    final /* synthetic */ List<Long> $ids;
    final /* synthetic */ ManagedActivityResultLauncher<IntentSenderRequest, ActivityResult> $intentSenderLauncher;
    final /* synthetic */ MutableState<List<SavedAudioUiItem>> $items$delegate;
    final /* synthetic */ MutableState<Boolean> $multiSelectionMode$delegate;
    final /* synthetic */ ContentResolver $resolver;
    final /* synthetic */ SnapshotStateList<Long> $selectedIds;
    Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1(List<Long> list, ContentResolver contentResolver, ManagedActivityResultLauncher<IntentSenderRequest, ActivityResult> managedActivityResultLauncher, Context context, SnapshotStateList<Long> snapshotStateList, MutableState<Uri> mutableState, MutableState<List<SavedAudioUiItem>> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1> continuation) {
        super(2, continuation);
        this.$ids = list;
        this.$resolver = contentResolver;
        this.$intentSenderLauncher = managedActivityResultLauncher;
        this.$context = context;
        this.$selectedIds = snapshotStateList;
        this.$grantedTreeUri$delegate = mutableState;
        this.$items$delegate = mutableState2;
        this.$multiSelectionMode$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1(this.$ids, this.$resolver, this.$intentSenderLauncher, this.$context, this.$selectedIds, this.$grantedTreeUri$delegate, this.$items$delegate, this.$multiSelectionMode$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
