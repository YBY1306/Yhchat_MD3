package com.yhchat.canarys.p007ui.discover;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: LazyDsl.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* renamed from: com.yhchat.canarys.ui.discover.BotDetailActivityKt$BotDetailScreen$lambda$20$0$2$0$$inlined$items$default$2 */
/* loaded from: classes6.dex */
public final class C3754x42db705 implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    public C3754x42db705(Function1 function1, List list) {
        this.$key = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int index) {
        return this.$key.invoke(this.$items.get(index));
    }
}
