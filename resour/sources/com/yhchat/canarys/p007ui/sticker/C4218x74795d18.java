package com.yhchat.canarys.p007ui.sticker;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: LazyGridDsl.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* renamed from: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$StickerPackDetailContent$lambda$2$1$0$$inlined$items$default$3 */
/* loaded from: classes13.dex */
public final class C4218x74795d18 implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $span;

    public C4218x74795d18(Function2 function2, List list) {
        this.$span = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m1190boximpl(m11835invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m11835invoke_orMbw(LazyGridItemSpanScope $this$items, int it) {
        return ((GridItemSpan) this.$span.invoke($this$items, this.$items.get(it))).getPackedValue();
    }
}
