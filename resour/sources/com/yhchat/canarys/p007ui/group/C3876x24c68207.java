package com.yhchat.canarys.p007ui.group;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: LazyDsl.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* renamed from: com.yhchat.canarys.ui.group.ChatSearchScreenKt$ChatSearchScreen$lambda$5$2$4$0$$inlined$items$default$2 */
/* loaded from: classes9.dex */
public final class C3876x24c68207 implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    public C3876x24c68207(Function1 function1, List list) {
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
