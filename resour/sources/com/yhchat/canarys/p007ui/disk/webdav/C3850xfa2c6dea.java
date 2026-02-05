package com.yhchat.canarys.p007ui.disk.webdav;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: LazyDsl.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* renamed from: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVBrowserScreen$lambda$12$0$6$0$0$$inlined$itemsIndexed$default$1 */
/* loaded from: classes7.dex */
public final class C3850xfa2c6dea implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $key;

    public C3850xfa2c6dea(Function2 function2, List list) {
        this.$key = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int index) {
        return this.$key.invoke(Integer.valueOf(index), this.$items.get(index));
    }
}
