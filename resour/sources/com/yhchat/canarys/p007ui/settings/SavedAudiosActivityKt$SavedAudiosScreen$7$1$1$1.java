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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1", m185f = "SavedAudiosActivity.kt", m186i = {1}, m187l = {556, 570}, m188m = "invokeSuspend", m189n = {"needsUserGrant"}, m191s = {"Z$0"}, m192v = 1)
/* loaded from: classes8.dex */
final class SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $finalName;
    final /* synthetic */ MutableState<Uri> $grantedTreeUri$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<IntentSenderRequest, ActivityResult> $intentSenderLauncher;
    final /* synthetic */ MutableState<List<SavedAudioUiItem>> $items$delegate;
    final /* synthetic */ MutableState<Boolean> $multiSelectionMode$delegate;
    final /* synthetic */ MutableState<SavedAudioUiItem> $renameTarget$delegate;
    final /* synthetic */ ContentResolver $resolver;
    final /* synthetic */ SnapshotStateList<Long> $selectedIds;
    final /* synthetic */ SavedAudioUiItem $target;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1(ContentResolver contentResolver, SavedAudioUiItem savedAudioUiItem, ManagedActivityResultLauncher<IntentSenderRequest, ActivityResult> managedActivityResultLauncher, String str, MutableState<SavedAudioUiItem> mutableState, Context context, SnapshotStateList<Long> snapshotStateList, MutableState<Uri> mutableState2, MutableState<List<SavedAudioUiItem>> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1> continuation) {
        super(2, continuation);
        this.$resolver = contentResolver;
        this.$target = savedAudioUiItem;
        this.$intentSenderLauncher = managedActivityResultLauncher;
        this.$finalName = str;
        this.$renameTarget$delegate = mutableState;
        this.$context = context;
        this.$selectedIds = snapshotStateList;
        this.$grantedTreeUri$delegate = mutableState2;
        this.$items$delegate = mutableState3;
        this.$multiSelectionMode$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1(this.$resolver, this.$target, this.$intentSenderLauncher, this.$finalName, this.$renameTarget$delegate, this.$context, this.$selectedIds, this.$grantedTreeUri$delegate, this.$items$delegate, this.$multiSelectionMode$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 0
            switch(r1) {
                case 0: goto L1e;
                case 1: goto L19;
                case 2: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            boolean r0 = r11.Z$0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L90
        L19:
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r12
            goto L41
        L1e:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1$needsUserGrant$1 r3 = new com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1$needsUserGrant$1
            android.content.ContentResolver r4 = r11.$resolver
            com.yhchat.canarys.ui.settings.SavedAudioUiItem r5 = r11.$target
            java.lang.String r6 = r11.$finalName
            r3.<init>(r4, r5, r6, r2)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = r11
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 1
            r11.label = r5
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r4)
            if (r1 != r0) goto L41
            return r0
        L41:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            androidx.compose.runtime.MutableState<com.yhchat.canarys.ui.settings.SavedAudioUiItem> r3 = r11.$renameTarget$delegate
            com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$lambda$22(r3, r2)
            if (r1 == 0) goto L74
            android.content.ContentResolver r0 = r11.$resolver
            com.yhchat.canarys.ui.settings.SavedAudioUiItem r2 = r11.$target
            android.net.Uri r2 = r2.getUri()
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            android.app.PendingIntent r0 = android.provider.MediaStore.createWriteRequest(r0, r2)
            java.lang.String r2 = "createWriteRequest(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            androidx.activity.compose.ManagedActivityResultLauncher<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> r2 = r11.$intentSenderLauncher
            androidx.activity.result.IntentSenderRequest$Builder r3 = new androidx.activity.result.IntentSenderRequest$Builder
            r3.<init>(r0)
            androidx.activity.result.IntentSenderRequest r3 = r3.build()
            r2.launch(r3)
            goto L91
        L74:
            android.content.ContentResolver r4 = r11.$resolver
            android.content.Context r5 = r11.$context
            androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Long> r6 = r11.$selectedIds
            androidx.compose.runtime.MutableState<android.net.Uri> r7 = r11.$grantedTreeUri$delegate
            androidx.compose.runtime.MutableState<java.util.List<com.yhchat.canarys.ui.settings.SavedAudioUiItem>> r8 = r11.$items$delegate
            androidx.compose.runtime.MutableState<java.lang.Boolean> r9 = r11.$multiSelectionMode$delegate
            r10 = r11
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
            r11.Z$0 = r1
            r2 = 2
            r11.label = r2
            java.lang.Object r2 = com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$reload(r4, r5, r6, r7, r8, r9, r10)
            if (r2 != r0) goto L8f
            return r0
        L8f:
            r0 = r1
        L90:
            r1 = r0
        L91:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
