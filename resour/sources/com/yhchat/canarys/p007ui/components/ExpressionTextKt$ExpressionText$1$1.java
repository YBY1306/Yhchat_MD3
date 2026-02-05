package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.p007ui.webview.WebViewActivity;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: ExpressionText.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
final class ExpressionTextKt$ExpressionText$1$1 implements PointerInputEventHandler {
    final /* synthetic */ AnnotatedString $annotatedString;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;

    ExpressionTextKt$ExpressionText$1$1(MutableState<TextLayoutResult> mutableState, AnnotatedString annotatedString, Context context) {
        this.$layoutResult = mutableState;
        this.$annotatedString = annotatedString;
        this.$context = context;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
        final AnnotatedString annotatedString = this.$annotatedString;
        final Context context = this.$context;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default($this$pointerInput, null, null, null, new Function1() { // from class: com.yhchat.canarys.ui.components.ExpressionTextKt$ExpressionText$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExpressionTextKt$ExpressionText$1$1.invoke$lambda$0(mutableState, annotatedString, context, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(MutableState $layoutResult, AnnotatedString $annotatedString, Context $context, Offset pos) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) $layoutResult.getValue();
        if (textLayoutResult != null) {
            int iM7203getOffsetForPositionk4lQ0M = textLayoutResult.m7203getOffsetForPositionk4lQ0M(pos.m4823unboximpl());
            AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) $annotatedString.getStringAnnotations("URL", iM7203getOffsetForPositionk4lQ0M, iM7203getOffsetForPositionk4lQ0M));
            if (range != null) {
                String str = (String) range.getItem();
                if (UnifiedLinkHandler.INSTANCE.isHandleableLink(str)) {
                    UnifiedLinkHandler.INSTANCE.handleLink($context, str);
                } else {
                    WebViewActivity.Companion.start$default(WebViewActivity.INSTANCE, $context, str, null, null, 12, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
