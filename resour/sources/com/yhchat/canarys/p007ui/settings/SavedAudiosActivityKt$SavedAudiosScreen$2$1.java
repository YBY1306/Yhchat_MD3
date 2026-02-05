package com.yhchat.canarys.p007ui.settings;

import android.support.v4.media.session.MediaControllerCompat;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$2$1", m185f = "SavedAudiosActivity.kt", m186i = {0, 0}, m187l = {270}, m188m = "invokeSuspend", m189n = {"$this$LaunchedEffect", "state"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes8.dex */
final class SavedAudiosActivityKt$SavedAudiosScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLongState $currentProgressMs$delegate;
    final /* synthetic */ MutableState<Boolean> $isPlayerPlaying$delegate;
    final /* synthetic */ MutableState<MediaControllerCompat> $mediaController$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedAudiosActivityKt$SavedAudiosScreen$2$1(MutableState<Boolean> mutableState, MutableState<MediaControllerCompat> mutableState2, MutableLongState mutableLongState, Continuation<? super SavedAudiosActivityKt$SavedAudiosScreen$2$1> continuation) {
        super(2, continuation);
        this.$isPlayerPlaying$delegate = mutableState;
        this.$mediaController$delegate = mutableState2;
        this.$currentProgressMs$delegate = mutableLongState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SavedAudiosActivityKt$SavedAudiosScreen$2$1 savedAudiosActivityKt$SavedAudiosScreen$2$1 = new SavedAudiosActivityKt$SavedAudiosScreen$2$1(this.$isPlayerPlaying$delegate, this.$mediaController$delegate, this.$currentProgressMs$delegate, continuation);
        savedAudiosActivityKt$SavedAudiosScreen$2$1.L$0 = obj;
        return savedAudiosActivityKt$SavedAudiosScreen$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavedAudiosActivityKt$SavedAudiosScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0085 -> B:28:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.label
            switch(r2) {
                case 0: goto L1f;
                case 1: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L15:
            java.lang.Object r2 = r12.L$1
            android.support.v4.media.session.PlaybackStateCompat r2 = (android.support.v4.media.session.PlaybackStateCompat) r2
            kotlin.ResultKt.throwOnFailure(r13)
            r3 = r12
            goto L88
        L1f:
            kotlin.ResultKt.throwOnFailure(r13)
            r2 = r12
        L23:
            boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
            if (r3 == 0) goto L8a
            androidx.compose.runtime.MutableState<java.lang.Boolean> r3 = r2.$isPlayerPlaying$delegate
            boolean r3 = com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$lambda$33(r3)
            if (r3 == 0) goto L8a
            androidx.compose.runtime.MutableState<android.support.v4.media.session.MediaControllerCompat> r3 = r2.$mediaController$delegate
            android.support.v4.media.session.MediaControllerCompat r3 = com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$lambda$42(r3)
            if (r3 == 0) goto L8a
            androidx.compose.runtime.MutableState<android.support.v4.media.session.MediaControllerCompat> r3 = r2.$mediaController$delegate
            android.support.v4.media.session.MediaControllerCompat r3 = com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$lambda$42(r3)
            if (r3 == 0) goto L46
            android.support.v4.media.session.PlaybackStateCompat r3 = r3.getPlaybackState()
            goto L47
        L46:
            r3 = 0
        L47:
            if (r3 == 0) goto L6e
            long r4 = r3.getPosition()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r3.getLastPositionUpdateTime()
            long r6 = r6 - r8
            int r8 = r3.getState()
            r9 = 3
            if (r8 != r9) goto L67
            float r8 = (float) r4
            float r9 = (float) r6
            float r10 = r3.getPlaybackSpeed()
            float r9 = r9 * r10
            float r8 = r8 + r9
            long r8 = (long) r8
            goto L68
        L67:
            r8 = r4
        L68:
            androidx.compose.runtime.MutableLongState r10 = r2.$currentProgressMs$delegate
            com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.access$SavedAudiosScreen$lambda$37(r10, r8)
        L6e:
            r4 = r2
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r2.L$0 = r0
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r2.L$1 = r5
            r5 = 1
            r2.label = r5
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.delay(r5, r4)
            if (r4 != r1) goto L85
            return r1
        L85:
            r11 = r3
            r3 = r2
            r2 = r11
        L88:
            r2 = r3
            goto L23
        L8a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
