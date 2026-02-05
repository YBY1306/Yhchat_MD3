package com.yhchat.canarys.p007ui.community;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ShareToFriendBottomSheet.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/SelectedContact;", "", Name.MARK, "", "type", "", "<init>", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SelectedContact {
    public static final int $stable = 0;
    private final String id;
    private final int type;

    public static /* synthetic */ SelectedContact copy$default(SelectedContact selectedContact, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = selectedContact.id;
        }
        if ((i2 & 2) != 0) {
            i = selectedContact.type;
        }
        return selectedContact.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final SelectedContact copy(String id, int type) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new SelectedContact(id, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedContact)) {
            return false;
        }
        SelectedContact selectedContact = (SelectedContact) other;
        return Intrinsics.areEqual(this.id, selectedContact.id) && this.type == selectedContact.type;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        return "SelectedContact(id=" + this.id + ", type=" + this.type + ")";
    }

    public SelectedContact(String id, int type) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.type = type;
    }

    public final String getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }
}
