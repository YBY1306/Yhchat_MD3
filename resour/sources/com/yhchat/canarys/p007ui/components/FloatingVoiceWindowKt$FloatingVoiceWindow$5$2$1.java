package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputChange;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.p000ui.unit.DpOffset;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatingVoiceWindow.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
final class FloatingVoiceWindowKt$FloatingVoiceWindow$5$2$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableState<DpOffset> $windowOffset$delegate;

    FloatingVoiceWindowKt$FloatingVoiceWindow$5$2$1(MutableState<DpOffset> mutableState) {
        this.$windowOffset$delegate = mutableState;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final MutableState<DpOffset> mutableState = this.$windowOffset$delegate;
        Object objDetectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default($this$pointerInput, null, null, null, new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$5$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FloatingVoiceWindowKt$FloatingVoiceWindow$5$2$1.invoke$lambda$0(mutableState, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation, 7, null);
        return objDetectDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(MutableState $windowOffset$delegate, PointerInputChange change, Offset dragAmount) {
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        float fM7806constructorimpl = C1834Dp.m7806constructorimpl(DpOffset.m7867getXD9Ej5fM(FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$2($windowOffset$delegate)) + C1834Dp.m7806constructorimpl(Float.intBitsToFloat((int) (dragAmount.m4823unboximpl() >> 32))));
        float fM7806constructorimpl2 = C1834Dp.m7806constructorimpl(DpOffset.m7869getYD9Ej5fM(FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$2($windowOffset$delegate)) + C1834Dp.m7806constructorimpl(Float.intBitsToFloat((int) (dragAmount.m4823unboximpl() & 4294967295L))));
        FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$3($windowOffset$delegate, DpOffset.m7862constructorimpl((Float.floatToRawIntBits(fM7806constructorimpl) << 32) | (Float.floatToRawIntBits(fM7806constructorimpl2) & 4294967295L)));
        return Unit.INSTANCE;
    }
}
