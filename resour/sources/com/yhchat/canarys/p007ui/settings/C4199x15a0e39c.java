package com.yhchat.canarys.p007ui.settings;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$importAudioLauncher$1$1$1", m185f = "SavedAudiosActivity.kt", m186i = {}, m187l = {287, 292}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* renamed from: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$importAudioLauncher$1$1$1 */
/* loaded from: classes8.dex */
final class C4199x15a0e39c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Uri> $grantedTreeUri$delegate;
    final /* synthetic */ MutableState<Boolean> $isRefreshing$delegate;
    final /* synthetic */ MutableState<List<SavedAudioUiItem>> $items$delegate;
    final /* synthetic */ MutableState<Boolean> $multiSelectionMode$delegate;
    final /* synthetic */ ContentResolver $resolver;
    final /* synthetic */ SnapshotStateList<Long> $selectedIds;
    final /* synthetic */ List<Uri> $uris;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4199x15a0e39c(MutableState<Boolean> mutableState, List<Uri> list, Context context, ContentResolver contentResolver, SnapshotStateList<Long> snapshotStateList, MutableState<Uri> mutableState2, MutableState<List<SavedAudioUiItem>> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super C4199x15a0e39c> continuation) {
        super(2, continuation);
        this.$isRefreshing$delegate = mutableState;
        this.$uris = list;
        this.$context = context;
        this.$resolver = contentResolver;
        this.$selectedIds = snapshotStateList;
        this.$grantedTreeUri$delegate = mutableState2;
        this.$items$delegate = mutableState3;
        this.$multiSelectionMode$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C4199x15a0e39c(this.$isRefreshing$delegate, this.$uris, this.$context, this.$resolver, this.$selectedIds, this.$grantedTreeUri$delegate, this.$items$delegate, this.$multiSelectionMode$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C4199x15a0e39c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L59
        L15:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L40
        L19:
            kotlin.ResultKt.throwOnFailure(r10)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r9.$isRefreshing$delegate
            r2 = 1
            com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$lambda$15(r1, r2)
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$importAudioLauncher$1$1$1$1 r3 = new com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$importAudioLauncher$1$1$1$1
            java.util.List<android.net.Uri> r4 = r9.$uris
            android.content.Context r5 = r9.$context
            r6 = 0
            r3.<init>(r4, r5, r6)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = r9
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r9.label = r2
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r4)
            if (r1 != r0) goto L40
            return r0
        L40:
            android.content.ContentResolver r2 = r9.$resolver
            android.content.Context r3 = r9.$context
            androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Long> r4 = r9.$selectedIds
            androidx.compose.runtime.MutableState<android.net.Uri> r5 = r9.$grantedTreeUri$delegate
            androidx.compose.runtime.MutableState<java.util.List<com.yhchat.canarys.ui.settings.SavedAudioUiItem>> r6 = r9.$items$delegate
            androidx.compose.runtime.MutableState<java.lang.Boolean> r7 = r9.$multiSelectionMode$delegate
            r8 = r9
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r1 = 2
            r9.label = r1
            java.lang.Object r1 = com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$reload(r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r0) goto L59
            return r0
        L59:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r9.$isRefreshing$delegate
            r1 = 0
            com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$lambda$15(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.C4199x15a0e39c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: SavedAudiosActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$importAudioLauncher$1$1$1$1", m185f = "SavedAudiosActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$importAudioLauncher$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ List<Uri> $uris;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<Uri> list, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uris = list;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uris, this.$context, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable<Uri> iterable = this.$uris;
                    Context context = this.$context;
                    for (Uri uri : iterable) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            SavedAudiosActivityKt.importAudioToSavedDir(context, uri);
                            Result.m11919constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m11919constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
