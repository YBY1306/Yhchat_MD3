package com.yhchat.canarys.p007ui.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt", m185f = "SavedAudiosActivity.kt", m186i = {0, 0, 0, 0, 0, 0}, m187l = {275}, m188m = "SavedAudiosScreen$reload", m189n = {"resolver", "context", "selectedIds", "grantedTreeUri$delegate", "items$delegate", "multiSelectionMode$delegate"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, m192v = 1)
/* loaded from: classes8.dex */
final class SavedAudiosActivityKt$SavedAudiosScreen$reload$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;

    SavedAudiosActivityKt$SavedAudiosScreen$reload$1(Continuation<? super SavedAudiosActivityKt$SavedAudiosScreen$reload$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SavedAudiosActivityKt.SavedAudiosScreen$reload(null, null, null, null, null, null, this);
    }
}
