package com.yhchat.canarys.p007ui.contacts;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsViewModel.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/ui/contacts/ContactGroup;", "", "title", "", "contacts", "", "Lcom/yhchat/canarys/ui/contacts/Contact;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getContacts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContactGroup {
    public static final int $stable = 8;
    private final List<Contact> contacts;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactGroup copy$default(ContactGroup contactGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactGroup.title;
        }
        if ((i & 2) != 0) {
            list = contactGroup.contacts;
        }
        return contactGroup.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Contact> component2() {
        return this.contacts;
    }

    public final ContactGroup copy(String title, List<Contact> contacts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        return new ContactGroup(title, contacts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactGroup)) {
            return false;
        }
        ContactGroup contactGroup = (ContactGroup) other;
        return Intrinsics.areEqual(this.title, contactGroup.title) && Intrinsics.areEqual(this.contacts, contactGroup.contacts);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.contacts.hashCode();
    }

    public String toString() {
        return "ContactGroup(title=" + this.title + ", contacts=" + this.contacts + ")";
    }

    public ContactGroup(String title, List<Contact> contacts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.title = title;
        this.contacts = contacts;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Contact> getContacts() {
        return this.contacts;
    }
}
