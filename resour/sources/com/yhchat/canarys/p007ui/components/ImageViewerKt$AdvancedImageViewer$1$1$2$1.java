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
final class ImageViewerKt$AdvancedImageViewer$1$1$2$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableFloatState $offsetX$delegate;
    final /* synthetic */ MutableFloatState $offsetY$delegate;
    final /* synthetic */ MutableFloatState $rotation$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;

    ImageViewerKt$AdvancedImageViewer$1$1$2$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, MutableFloatState mutableFloatState4) {
        this.$scale$delegate = mutableFloatState;
        this.$rotation$delegate = mutableFloatState2;
        this.$offsetX$delegate = mutableFloatState3;
        this.$offsetY$delegate = mutableFloatState4;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final MutableFloatState mutableFloatState = this.$scale$delegate;
        final MutableFloatState mutableFloatState2 = this.$rotation$delegate;
        final MutableFloatState mutableFloatState3 = this.$offsetX$delegate;
        final MutableFloatState mutableFloatState4 = this.$offsetY$delegate;
        Object objDetectTransformGestures$default = TransformGestureDetectorKt.detectTransformGestures$default($this$pointerInput, false, new Function4() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$AdvancedImageViewer$1$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ImageViewerKt$AdvancedImageViewer$1$1$2$1.invoke$lambda$0($this$pointerInput, mutableFloatState, mutableFloatState2, mutableFloatState3, mutableFloatState4, (Offset) obj, (Offset) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue());
            }
        }, continuation, 1, null);
        return objDetectTransformGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTransformGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(PointerInputScope $this_pointerInput, MutableFloatState $scale$delegate, MutableFloatState $rotation$delegate, MutableFloatState $offsetX$delegate, MutableFloatState $offsetY$delegate, Offset centroid, Offset pan, float zoom, float rotate) {
        float newScale = RangesKt.coerceIn(ImageViewerKt.AdvancedImageViewer$lambda$1($scale$delegate) * zoom, 0.3f, 5.0f);
        $scale$delegate.setFloatValue(newScale);
        $rotation$delegate.setFloatValue(ImageViewerKt.AdvancedImageViewer$lambda$10($rotation$delegate) + (57.3f * rotate));
        if (Math.abs(ImageViewerKt.AdvancedImageViewer$lambda$10($rotation$delegate)) > 360.0f) {
            $rotation$delegate.setFloatValue(ImageViewerKt.AdvancedImageViewer$lambda$10($rotation$delegate) % 360.0f);
        }
        float f = 1;
        float f2 = 2;
        float maxTranslationX = (((int) ($this_pointerInput.getBoundsSize() >> 32)) * (newScale - f)) / f2;
        float maxTranslationY = (((int) ($this_pointerInput.getBoundsSize() & 4294967295L)) * (newScale - f)) / f2;
        $offsetX$delegate.setFloatValue(RangesKt.coerceIn(ImageViewerKt.AdvancedImageViewer$lambda$4($offsetX$delegate) + Float.intBitsToFloat((int) (pan.m4823unboximpl() >> 32)), -maxTranslationX, maxTranslationX));
        $offsetY$delegate.setFloatValue(RangesKt.coerceIn(ImageViewerKt.AdvancedImageViewer$lambda$7($offsetY$delegate) + Float.intBitsToFloat((int) (pan.m4823unboximpl() & 4294967295L)), -maxTranslationY, maxTranslationY));
        return Unit.INSTANCE;
    }
}
