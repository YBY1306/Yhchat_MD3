package com.yhchat.canarys.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.yhchat.canarys.data.model.NavigationConfig;
import com.yhchat.canarys.data.model.NavigationItem;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: NavigationRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0006\u0010\u001e\u001a\u00020\u0013J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/data/repository/NavigationRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "_navigationConfig", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/data/model/NavigationConfig;", "navigationConfig", "Lkotlinx/coroutines/flow/StateFlow;", "getNavigationConfig", "()Lkotlinx/coroutines/flow/StateFlow;", "loadNavigationConfig", "saveNavigationConfig", "", "config", "updateItemVisibility", "itemId", "", "isVisible", "", "updateItemsOrder", "orderedItems", "", "Lcom/yhchat/canarys/data/model/NavigationItem;", "resetToDefault", "getVisibleItems", "getAllAvailableItems", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class NavigationRepository {
    private static final String KEY_NAVIGATION_CONFIG = "navigation_config";
    private final MutableStateFlow<NavigationConfig> _navigationConfig;
    private final Context context;
    private final Gson gson;
    private final StateFlow<NavigationConfig> navigationConfig;
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    @Inject
    public NavigationRepository(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(KEY_NAVIGATION_CONFIG, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
        this.gson = new Gson();
        this._navigationConfig = StateFlowKt.MutableStateFlow(loadNavigationConfig());
        this.navigationConfig = FlowKt.asStateFlow(this._navigationConfig);
    }

    public final StateFlow<NavigationConfig> getNavigationConfig() {
        return this.navigationConfig;
    }

    private final NavigationConfig loadNavigationConfig() {
        String configJson = this.sharedPreferences.getString(KEY_NAVIGATION_CONFIG, null);
        if (configJson != null) {
            try {
                Object objFromJson = this.gson.fromJson(configJson, (Class<Object>) NavigationConfig.class);
                Intrinsics.checkNotNull(objFromJson);
                return (NavigationConfig) objFromJson;
            } catch (Exception e) {
                return NavigationConfig.INSTANCE.getDefault();
            }
        }
        return NavigationConfig.INSTANCE.getDefault();
    }

    public final void saveNavigationConfig(NavigationConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String configJson = this.gson.toJson(config);
        this.sharedPreferences.edit().putString(KEY_NAVIGATION_CONFIG, configJson).apply();
        this._navigationConfig.setValue(config);
    }

    public final void updateItemVisibility(String itemId, boolean isVisible) {
        NavigationItem navigationItemCopy$default;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        NavigationConfig currentConfig = this._navigationConfig.getValue();
        Iterable<NavigationItem> items = currentConfig.getItems();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (NavigationItem navigationItem : items) {
            if (Intrinsics.areEqual(navigationItem.getId(), itemId)) {
                navigationItemCopy$default = NavigationItem.copy$default(navigationItem, null, null, null, null, null, 0, isVisible, 63, null);
            } else {
                navigationItemCopy$default = navigationItem;
            }
            arrayList.add(navigationItemCopy$default);
        }
        List updatedItems = (List) arrayList;
        NavigationConfig updatedConfig = currentConfig.copy(updatedItems);
        saveNavigationConfig(updatedConfig);
    }

    public final void updateItemsOrder(List<NavigationItem> orderedItems) {
        Intrinsics.checkNotNullParameter(orderedItems, "orderedItems");
        List<NavigationItem> list = orderedItems;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(NavigationItem.copy$default((NavigationItem) obj, null, null, null, null, null, i, false, 95, null));
            i = i2;
        }
        List updatedItems = (List) arrayList;
        NavigationConfig currentConfig = this._navigationConfig.getValue();
        NavigationConfig updatedConfig = currentConfig.copy(updatedItems);
        saveNavigationConfig(updatedConfig);
    }

    public final void resetToDefault() {
        saveNavigationConfig(NavigationConfig.INSTANCE.getDefault());
    }

    public final List<NavigationItem> getVisibleItems() {
        Iterable items = this._navigationConfig.getValue().getItems();
        Collection arrayList = new ArrayList();
        for (Object obj : items) {
            if (((NavigationItem) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: com.yhchat.canarys.data.repository.NavigationRepository$getVisibleItems$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((NavigationItem) t).getOrder()), Integer.valueOf(((NavigationItem) t2).getOrder()));
            }
        });
    }

    public final List<NavigationItem> getAllAvailableItems() {
        return NavigationConfig.INSTANCE.getAllAvailableItems();
    }
}
