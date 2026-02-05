package com.yhchat.canarys.p007ui.settings;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/SavedAudioUiItem;", "", Name.MARK, "", "uri", "Landroid/net/Uri;", "displayName", "", "dateAddedSeconds", "sizeBytes", "<init>", "(JLandroid/net/Uri;Ljava/lang/String;JJ)V", "getId", "()J", "getUri", "()Landroid/net/Uri;", "getDisplayName", "()Ljava/lang/String;", "getDateAddedSeconds", "getSizeBytes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
final /* data */ class SavedAudioUiItem {
    private final long dateAddedSeconds;
    private final String displayName;
    private final long id;
    private final long sizeBytes;
    private final Uri uri;

    public static /* synthetic */ SavedAudioUiItem copy$default(SavedAudioUiItem savedAudioUiItem, long j, Uri uri, String str, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = savedAudioUiItem.id;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            uri = savedAudioUiItem.uri;
        }
        Uri uri2 = uri;
        if ((i & 4) != 0) {
            str = savedAudioUiItem.displayName;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            j2 = savedAudioUiItem.dateAddedSeconds;
        }
        return savedAudioUiItem.copy(j4, uri2, str2, j2, (i & 16) != 0 ? savedAudioUiItem.sizeBytes : j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
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
    public final long getDateAddedSeconds() {
        return this.dateAddedSeconds;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final SavedAudioUiItem copy(long id, Uri uri, String displayName, long dateAddedSeconds, long sizeBytes) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new SavedAudioUiItem(id, uri, displayName, dateAddedSeconds, sizeBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedAudioUiItem)) {
            return false;
        }
        SavedAudioUiItem savedAudioUiItem = (SavedAudioUiItem) other;
        return this.id == savedAudioUiItem.id && Intrinsics.areEqual(this.uri, savedAudioUiItem.uri) && Intrinsics.areEqual(this.displayName, savedAudioUiItem.displayName) && this.dateAddedSeconds == savedAudioUiItem.dateAddedSeconds && this.sizeBytes == savedAudioUiItem.sizeBytes;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.uri.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Long.hashCode(this.dateAddedSeconds)) * 31) + Long.hashCode(this.sizeBytes);
    }

    public String toString() {
        return "SavedAudioUiItem(id=" + this.id + ", uri=" + this.uri + ", displayName=" + this.displayName + ", dateAddedSeconds=" + this.dateAddedSeconds + ", sizeBytes=" + this.sizeBytes + ")";
    }

    public SavedAudioUiItem(long id, Uri uri, String displayName, long dateAddedSeconds, long sizeBytes) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.id = id;
        this.uri = uri;
        this.displayName = displayName;
        this.dateAddedSeconds = dateAddedSeconds;
        this.sizeBytes = sizeBytes;
    }

    public final long getId() {
        return this.id;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getDateAddedSeconds() {
        return this.dateAddedSeconds;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }
}
