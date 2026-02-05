package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: ImageViewer.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
final class ImageViewerKt$ImageViewer$1$1$3$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableFloatState $offsetX$delegate;
    final /* synthetic */ MutableFloatState $offsetY$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ MutableFloatState $rotation$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;

    ImageViewerKt$ImageViewer$1$1$3$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, MutableFloatState mutableFloatState4, Function0<Unit> function0) {
        this.$scale$delegate = mutableFloatState;
        this.$offsetX$delegate = mutableFloatState2;
        this.$offsetY$delegate = mutableFloatState3;
        this.$rotation$delegate = mutableFloatState4;
        this.$onDismiss = function0;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final MutableFloatState mutableFloatState = this.$scale$delegate;
        final MutableFloatState mutableFloatState2 = this.$offsetX$delegate;
        final MutableFloatState mutableFloatState3 = this.$offsetY$delegate;
        final MutableFloatState mutableFloatState4 = this.$rotation$delegate;
        Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$ImageViewer$1$1$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageViewerKt$ImageViewer$1$1$3$1.invoke$lambda$0(mutableFloatState, mutableFloatState2, mutableFloatState3, mutableFloatState4, (Offset) obj);
            }
        };
        final Function0<Unit> function0 = this.$onDismiss;
        final MutableFloatState mutableFloatState5 = this.$scale$delegate;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default($this$pointerInput, function1, null, null, new Function1() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$ImageViewer$1$1$3$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageViewerKt$ImageViewer$1$1$3$1.invoke$lambda$1(function0, mutableFloatState5, (Offset) obj);
            }
        }, continuation, 6, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(MutableFloatState $scale$delegate, MutableFloatState $offsetX$delegate, MutableFloatState $offsetY$delegate, MutableFloatState $rotation$delegate, Offset it) {
        if (ImageViewerKt.ImageViewer$lambda$1($scale$delegate) > 1.0f) {
            $scale$delegate.setFloatValue(1.0f);
            $offsetX$delegate.setFloatValue(0.0f);
            $offsetY$delegate.setFloatValue(0.0f);
            $rotation$delegate.setFloatValue(0.0f);
        } else {
            $scale$delegate.setFloatValue(2.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function0 $onDismiss, MutableFloatState $scale$delegate, Offset it) {
        if (ImageViewerKt.ImageViewer$lambda$1($scale$delegate) <= 1.0f) {
            $onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }
}
