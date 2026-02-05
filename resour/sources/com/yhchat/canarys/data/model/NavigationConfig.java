package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationConfig.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/model/NavigationConfig;", "", "items", "", "Lcom/yhchat/canarys/data/model/NavigationItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class NavigationConfig {

    @SerializedName("items")
    private final List<NavigationItem> items;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public NavigationConfig() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationConfig copy$default(NavigationConfig navigationConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = navigationConfig.items;
        }
        return navigationConfig.copy(list);
    }

    public final List<NavigationItem> component1() {
        return this.items;
    }

    public final NavigationConfig copy(List<NavigationItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new NavigationConfig(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NavigationConfig) && Intrinsics.areEqual(this.items, ((NavigationConfig) other).items);
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return "NavigationConfig(items=" + this.items + ")";
    }

    public NavigationConfig(List<NavigationItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    public /* synthetic */ NavigationConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<NavigationItem> getItems() {
        return this.items;
    }

    /* compiled from: NavigationConfig.kt */
    @Metadata(m168d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/data/model/NavigationConfig$Companion;", "", "<init>", "()V", "getDefault", "Lcom/yhchat/canarys/data/model/NavigationConfig;", "getAllAvailableItems", "", "Lcom/yhchat/canarys/data/model/NavigationItem;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavigationConfig getDefault() {
            List defaultItems = CollectionsKt.listOf((Object[]) new NavigationItem[]{new NavigationItem("conversation", "\u4f1a\u8bdd", "\u4f1a\u8bdd", "Chat", "conversation", 0, true), new NavigationItem("community", "\u793e\u7fa4", "\u793e\u7fa4", "People", "community", 1, true), new NavigationItem("contacts", "\u8054\u7cfb\u4eba", "\u8054\u7cfb\u4eba", "Contacts", "contacts", 2, true), new NavigationItem("discover", "\u53d1\u73b0", "\u53d1\u73b0", "Explore", "discover", 3, true), new NavigationItem("profile", "\u6211\u7684", "\u6211\u7684", "Person", "profile", 4, true)});
            return new NavigationConfig(defaultItems);
        }

        public final List<NavigationItem> getAllAvailableItems() {
            return getDefault().getItems();
        }
    }
}
