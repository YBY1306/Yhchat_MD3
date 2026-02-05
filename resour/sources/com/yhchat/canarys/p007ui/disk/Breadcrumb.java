package com.yhchat.canarys.p007ui.disk;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: GroupDiskActivity.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/Breadcrumb;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Breadcrumb {
    public static final int $stable = 0;
    private final long id;
    private final String name;

    public static /* synthetic */ Breadcrumb copy$default(Breadcrumb breadcrumb, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = breadcrumb.id;
        }
        if ((i & 2) != 0) {
            str = breadcrumb.name;
        }
        return breadcrumb.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Breadcrumb copy(long id, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Breadcrumb(id, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Breadcrumb)) {
            return false;
        }
        Breadcrumb breadcrumb = (Breadcrumb) other;
        return this.id == breadcrumb.id && Intrinsics.areEqual(this.name, breadcrumb.name);
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "Breadcrumb(id=" + this.id + ", name=" + this.name + ")";
    }

    public Breadcrumb(long id, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }
}
