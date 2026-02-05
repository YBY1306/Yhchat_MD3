package com.yhchat.canarys.p007ui.contacts;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsViewModel.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/ui/contacts/Contact;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "permissionLevel", "", "noDisturb", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZI)V", "getChatId", "()Ljava/lang/String;", "getName", "getAvatarUrl", "getPermissionLevel", "()I", "getNoDisturb", "()Z", "getChatType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Contact {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String chatId;
    private final int chatType;
    private final String name;
    private final boolean noDisturb;
    private final int permissionLevel;

    public static /* synthetic */ Contact copy$default(Contact contact, String str, String str2, String str3, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = contact.chatId;
        }
        if ((i3 & 2) != 0) {
            str2 = contact.name;
        }
        if ((i3 & 4) != 0) {
            str3 = contact.avatarUrl;
        }
        if ((i3 & 8) != 0) {
            i = contact.permissionLevel;
        }
        if ((i3 & 16) != 0) {
            z = contact.noDisturb;
        }
        if ((i3 & 32) != 0) {
            i2 = contact.chatType;
        }
        boolean z2 = z;
        int i4 = i2;
        return contact.copy(str, str2, str3, i, z2, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPermissionLevel() {
        return this.permissionLevel;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getNoDisturb() {
        return this.noDisturb;
    }

    /* renamed from: component6, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    public final Contact copy(String chatId, String name, String avatarUrl, int permissionLevel, boolean noDisturb, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new Contact(chatId, name, avatarUrl, permissionLevel, noDisturb, chatType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) other;
        return Intrinsics.areEqual(this.chatId, contact.chatId) && Intrinsics.areEqual(this.name, contact.name) && Intrinsics.areEqual(this.avatarUrl, contact.avatarUrl) && this.permissionLevel == contact.permissionLevel && this.noDisturb == contact.noDisturb && this.chatType == contact.chatType;
    }

    public int hashCode() {
        return (((((((((this.chatId.hashCode() * 31) + this.name.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Integer.hashCode(this.permissionLevel)) * 31) + Boolean.hashCode(this.noDisturb)) * 31) + Integer.hashCode(this.chatType);
    }

    public String toString() {
        return "Contact(chatId=" + this.chatId + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", permissionLevel=" + this.permissionLevel + ", noDisturb=" + this.noDisturb + ", chatType=" + this.chatType + ")";
    }

    public Contact(String chatId, String name, String avatarUrl, int permissionLevel, boolean noDisturb, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.chatId = chatId;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.permissionLevel = permissionLevel;
        this.noDisturb = noDisturb;
        this.chatType = chatType;
    }

    public /* synthetic */ Contact(String str, String str2, String str3, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 1 : i2);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getPermissionLevel() {
        return this.permissionLevel;
    }

    public final boolean getNoDisturb() {
        return this.noDisturb;
    }

    public final int getChatType() {
        return this.chatType;
    }
}
