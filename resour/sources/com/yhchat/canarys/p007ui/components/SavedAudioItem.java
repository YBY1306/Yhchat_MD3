package com.yhchat.canarys.p007ui.components;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: FloatingVoiceWindow.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/components/SavedAudioItem;", "", Name.MARK, "", "uri", "Landroid/net/Uri;", "displayName", "dateAdded", "", "formattedDate", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "getDisplayName", "getDateAdded", "()J", "getFormattedDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SavedAudioItem {
    public static final int $stable = 8;
    private final long dateAdded;
    private final String displayName;
    private final String formattedDate;
    private final String id;
    private final Uri uri;

    public static /* synthetic */ SavedAudioItem copy$default(SavedAudioItem savedAudioItem, String str, Uri uri, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedAudioItem.id;
        }
        if ((i & 2) != 0) {
            uri = savedAudioItem.uri;
        }
        if ((i & 4) != 0) {
            str2 = savedAudioItem.displayName;
        }
        if ((i & 8) != 0) {
            j = savedAudioItem.dateAdded;
        }
        if ((i & 16) != 0) {
            str3 = savedAudioItem.formattedDate;
        }
        String str4 = str3;
        String str5 = str2;
        return savedAudioItem.copy(str, uri, str5, j, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDateAdded() {
        return this.dateAdded;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFormattedDate() {
        return this.formattedDate;
    }

    public final SavedAudioItem copy(String id, Uri uri, String displayName, long dateAdded, String formattedDate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        return new SavedAudioItem(id, uri, displayName, dateAdded, formattedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedAudioItem)) {
            return false;
        }
        SavedAudioItem savedAudioItem = (SavedAudioItem) other;
        return Intrinsics.areEqual(this.id, savedAudioItem.id) && Intrinsics.areEqual(this.uri, savedAudioItem.uri) && Intrinsics.areEqual(this.displayName, savedAudioItem.displayName) && this.dateAdded == savedAudioItem.dateAdded && Intrinsics.areEqual(this.formattedDate, savedAudioItem.formattedDate);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.uri.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Long.hashCode(this.dateAdded)) * 31) + this.formattedDate.hashCode();
    }

    public String toString() {
        return "SavedAudioItem(id=" + this.id + ", uri=" + this.uri + ", displayName=" + this.displayName + ", dateAdded=" + this.dateAdded + ", formattedDate=" + this.formattedDate + ")";
    }

    public SavedAudioItem(String id, Uri uri, String displayName, long dateAdded, String formattedDate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        this.id = id;
        this.uri = uri;
        this.displayName = displayName;
        this.dateAdded = dateAdded;
        this.formattedDate = formattedDate;
    }

    public final String getId() {
        return this.id;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final String getFormattedDate() {
        return this.formattedDate;
    }
}
