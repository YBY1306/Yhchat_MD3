package com.yhchat.canarys.p007ui.group;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupInfoScreen.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/QuickAction;", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "label", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getLabel", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QuickAction {
    public static final int $stable = 0;
    private final ImageVector icon;
    private final String label;
    private final Function0<Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickAction copy$default(QuickAction quickAction, ImageVector imageVector, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            imageVector = quickAction.icon;
        }
        if ((i & 2) != 0) {
            str = quickAction.label;
        }
        if ((i & 4) != 0) {
            function0 = quickAction.onClick;
        }
        return quickAction.copy(imageVector, str, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageVector getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final Function0<Unit> component3() {
        return this.onClick;
    }

    public final QuickAction copy(ImageVector icon, String label, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new QuickAction(icon, label, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickAction)) {
            return false;
        }
        QuickAction quickAction = (QuickAction) other;
        return Intrinsics.areEqual(this.icon, quickAction.icon) && Intrinsics.areEqual(this.label, quickAction.label) && Intrinsics.areEqual(this.onClick, quickAction.onClick);
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.label.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "QuickAction(icon=" + this.icon + ", label=" + this.label + ", onClick=" + this.onClick + ")";
    }

    public QuickAction(ImageVector icon, String label, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.icon = icon;
        this.label = label;
        this.onClick = onClick;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
