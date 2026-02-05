package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.RangesKt;

/* compiled from: ImageViewer.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
final class ImageViewerKt$ImageViewer$1$1$2$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableFloatState $offsetX$delegate;
    final /* synthetic */ MutableFloatState $offsetY$delegate;
    final /* synthetic */ MutableFloatState $rotation$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;

    ImageViewerKt$ImageViewer$1$1$2$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, MutableFloatState mutableFloatState4) {
        this.$scale$delegate = mutableFloatState;
        this.$rotation$delegate = mutableFloatState2;
        this.$offsetX$delegate = mutableFloatState3;
        this.$offsetY$delegate = mutableFloatState4;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final MutableFloatState mutableFloatState = this.$scale$delegate;
        final MutableFloatState mutableFloatState2 = this.$rotation$delegate;
        final MutableFloatState mutableFloatState3 = this.$offsetX$delegate;
        final MutableFloatState mutableFloatState4 = this.$offsetY$delegate;
        Object objDetectTransformGestures$default = TransformGestureDetectorKt.detectTransformGestures$default($this$pointerInput, false, new Function4() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$ImageViewer$1$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ImageViewerKt$ImageViewer$1$1$2$1.invoke$lambda$0(mutableFloatState, mutableFloatState2, mutableFloatState3, mutableFloatState4, (Offset) obj, (Offset) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue());
            }
        }, continuation, 1, null);
        return objDetectTransformGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTransformGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(MutableFloatState $scale$delegate, MutableFloatState $rotation$delegate, MutableFloatState $offsetX$delegate, MutableFloatState $offsetY$delegate, Offset offset, Offset pan, float zoom, float rotate) {
        $scale$delegate.setFloatValue(RangesKt.coerceIn(ImageViewerKt.ImageViewer$lambda$1($scale$delegate) * zoom, 0.1f, 100.0f));
        $rotation$delegate.setFloatValue(ImageViewerKt.ImageViewer$lambda$10($rotation$delegate) + rotate);
        $offsetX$delegate.setFloatValue(ImageViewerKt.ImageViewer$lambda$4($offsetX$delegate) + Float.intBitsToFloat((int) (pan.m4823unboximpl() >> 32)));
        $offsetY$delegate.setFloatValue(ImageViewerKt.ImageViewer$lambda$7($offsetY$delegate) + Float.intBitsToFloat((int) (4294967295L & pan.m4823unboximpl())));
        return Unit.INSTANCE;
    }
}
