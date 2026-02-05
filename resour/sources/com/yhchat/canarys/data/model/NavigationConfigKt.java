package com.yhchat.canarys.data.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationConfig.kt */
@Metadata(m168d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u00a8\u0006\u0004"}, m169d2 = {"getVisibleItems", "", "Lcom/yhchat/canarys/data/model/NavigationItem;", "Lcom/yhchat/canarys/data/model/NavigationConfig;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final class NavigationConfigKt {
    public static final List<NavigationItem> getVisibleItems(NavigationConfig $this$getVisibleItems) {
        Intrinsics.checkNotNullParameter($this$getVisibleItems, "<this>");
        Iterable items = $this$getVisibleItems.getItems();
        Collection arrayList = new ArrayList();
        for (Object obj : items) {
            if (((NavigationItem) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: com.yhchat.canarys.data.model.NavigationConfigKt$getVisibleItems$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((NavigationItem) t).getOrder()), Integer.valueOf(((NavigationItem) t2).getOrder()));
            }
        });
    }
}
