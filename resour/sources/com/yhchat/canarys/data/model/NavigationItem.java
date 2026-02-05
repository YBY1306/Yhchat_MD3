package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ChatKt;
import androidx.compose.material.icons.filled.AccountBoxKt;
import androidx.compose.material.icons.filled.ExploreKt;
import androidx.compose.material.icons.filled.GroupKt;
import androidx.compose.material.icons.filled.HomeKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.simpleframework.xml.strategy.Name;

/* compiled from: NavigationConfig.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\tH\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/model/NavigationItem;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "title", "iconName", "route", "order", "", "isVisible", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getId", "()Ljava/lang/String;", "getName", "getTitle", "getIconName", "getRoute", "getOrder", "()I", "()Z", "getIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class NavigationItem {
    public static final int $stable = 0;

    @SerializedName("icon")
    private final String iconName;

    @SerializedName(Name.MARK)
    private final String id;

    @SerializedName("isVisible")
    private final boolean isVisible;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("order")
    private final int order;

    @SerializedName("route")
    private final String route;

    @SerializedName("title")
    private final String title;

    public NavigationItem() {
        this(null, null, null, null, null, 0, false, 127, null);
    }

    public static /* synthetic */ NavigationItem copy$default(NavigationItem navigationItem, String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navigationItem.id;
        }
        if ((i2 & 2) != 0) {
            str2 = navigationItem.name;
        }
        if ((i2 & 4) != 0) {
            str3 = navigationItem.title;
        }
        if ((i2 & 8) != 0) {
            str4 = navigationItem.iconName;
        }
        if ((i2 & 16) != 0) {
            str5 = navigationItem.route;
        }
        if ((i2 & 32) != 0) {
            i = navigationItem.order;
        }
        if ((i2 & 64) != 0) {
            z = navigationItem.isVisible;
        }
        int i3 = i;
        boolean z2 = z;
        String str6 = str5;
        String str7 = str3;
        return navigationItem.copy(str, str2, str7, str4, str6, i3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final NavigationItem copy(String str, String str2, String title, String iconName, String route, int order, boolean isVisible) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        Intrinsics.checkNotNullParameter(route, "route");
        return new NavigationItem(str, str2, title, iconName, route, order, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationItem)) {
            return false;
        }
        NavigationItem navigationItem = (NavigationItem) other;
        return Intrinsics.areEqual(this.id, navigationItem.id) && Intrinsics.areEqual(this.name, navigationItem.name) && Intrinsics.areEqual(this.title, navigationItem.title) && Intrinsics.areEqual(this.iconName, navigationItem.iconName) && Intrinsics.areEqual(this.route, navigationItem.route) && this.order == navigationItem.order && this.isVisible == navigationItem.isVisible;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.iconName.hashCode()) * 31) + this.route.hashCode()) * 31) + Integer.hashCode(this.order)) * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "NavigationItem(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", iconName=" + this.iconName + ", route=" + this.route + ", order=" + this.order + ", isVisible=" + this.isVisible + ")";
    }

    public NavigationItem(String id, String name, String title, String iconName, String route, int order, boolean isVisible) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        Intrinsics.checkNotNullParameter(route, "route");
        this.id = id;
        this.name = name;
        this.title = title;
        this.iconName = iconName;
        this.route = route;
        this.order = order;
        this.isVisible = isVisible;
    }

    public /* synthetic */ NavigationItem(String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? true : z);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final String getRoute() {
        return this.route;
    }

    public final int getOrder() {
        return this.order;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final ImageVector getIcon() {
        ImageVector icon = StringsKt.equals(this.iconName, "Chat", true) ? ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE) : StringsKt.equals(this.iconName, "People", true) ? GroupKt.getGroup(Icons.Filled.INSTANCE) : StringsKt.equals(this.iconName, "Contacts", true) ? AccountBoxKt.getAccountBox(Icons.Filled.INSTANCE) : StringsKt.equals(this.iconName, "Search", true) ? SearchKt.getSearch(Icons.Filled.INSTANCE) : StringsKt.equals(this.iconName, "Person", true) ? PersonKt.getPerson(Icons.Filled.INSTANCE) : StringsKt.equals(this.iconName, "Explore", true) ? ExploreKt.getExplore(Icons.Filled.INSTANCE) : StringsKt.equals(this.iconName, "Settings", true) ? SettingsKt.getSettings(Icons.Filled.INSTANCE) : null;
        if (icon != null) {
            return icon;
        }
        String str = this.id;
        switch (str.hashCode()) {
            case -1480249367:
                if (str.equals("community")) {
                    return GroupKt.getGroup(Icons.Filled.INSTANCE);
                }
                break;
            case -567451565:
                if (str.equals("contacts")) {
                    return AccountBoxKt.getAccountBox(Icons.Filled.INSTANCE);
                }
                break;
            case -309425751:
                if (str.equals("profile")) {
                    return PersonKt.getPerson(Icons.Filled.INSTANCE);
                }
                break;
            case 273184745:
                if (str.equals("discover")) {
                    return ExploreKt.getExplore(Icons.Filled.INSTANCE);
                }
                break;
            case 740154499:
                if (str.equals("conversation")) {
                    return ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE);
                }
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    return SettingsKt.getSettings(Icons.Filled.INSTANCE);
                }
                break;
        }
        return HomeKt.getHome(Icons.Filled.INSTANCE);
    }
}
