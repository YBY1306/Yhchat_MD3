package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003Jb\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f\u00a8\u0006*"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MessageMedia;", "", "fileKey", "", "fileHash", "fileType", "imageHeight", "", "imageWidth", "fileSize", "fileKey2", "fileSuffix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;)V", "getFileKey", "()Ljava/lang/String;", "getFileHash", "getFileType", "getImageHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImageWidth", "getFileSize", "()J", "getFileKey2", "getFileSuffix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/MessageMedia;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MessageMedia {
    public static final int $stable = 0;

    @SerializedName("file_hash")
    private final String fileHash;

    @SerializedName("file_key")
    private final String fileKey;

    @SerializedName("file_key2")
    private final String fileKey2;

    @SerializedName("file_size")
    private final long fileSize;

    @SerializedName("file_suffix")
    private final String fileSuffix;

    @SerializedName("file_type")
    private final String fileType;

    @SerializedName("image_height")
    private final Long imageHeight;

    @SerializedName("image_width")
    private final Long imageWidth;

    public static /* synthetic */ MessageMedia copy$default(MessageMedia messageMedia, String str, String str2, String str3, Long l, Long l2, long j, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageMedia.fileKey;
        }
        if ((i & 2) != 0) {
            str2 = messageMedia.fileHash;
        }
        if ((i & 4) != 0) {
            str3 = messageMedia.fileType;
        }
        if ((i & 8) != 0) {
            l = messageMedia.imageHeight;
        }
        if ((i & 16) != 0) {
            l2 = messageMedia.imageWidth;
        }
        if ((i & 32) != 0) {
            j = messageMedia.fileSize;
        }
        if ((i & 64) != 0) {
            str4 = messageMedia.fileKey2;
        }
        if ((i & 128) != 0) {
            str5 = messageMedia.fileSuffix;
        }
        long j2 = j;
        Long l3 = l;
        Long l4 = l2;
        String str6 = str3;
        return messageMedia.copy(str, str2, str6, l3, l4, j2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileKey() {
        return this.fileKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileHash() {
        return this.fileHash;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getImageHeight() {
        return this.imageHeight;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getImageWidth() {
        return this.imageWidth;
    }

    /* renamed from: component6, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFileKey2() {
        return this.fileKey2;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFileSuffix() {
        return this.fileSuffix;
    }

    public final MessageMedia copy(String fileKey, String fileHash, String fileType, Long imageHeight, Long imageWidth, long fileSize, String fileKey2, String fileSuffix) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(fileKey2, "fileKey2");
        Intrinsics.checkNotNullParameter(fileSuffix, "fileSuffix");
        return new MessageMedia(fileKey, fileHash, fileType, imageHeight, imageWidth, fileSize, fileKey2, fileSuffix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageMedia)) {
            return false;
        }
        MessageMedia messageMedia = (MessageMedia) other;
        return Intrinsics.areEqual(this.fileKey, messageMedia.fileKey) && Intrinsics.areEqual(this.fileHash, messageMedia.fileHash) && Intrinsics.areEqual(this.fileType, messageMedia.fileType) && Intrinsics.areEqual(this.imageHeight, messageMedia.imageHeight) && Intrinsics.areEqual(this.imageWidth, messageMedia.imageWidth) && this.fileSize == messageMedia.fileSize && Intrinsics.areEqual(this.fileKey2, messageMedia.fileKey2) && Intrinsics.areEqual(this.fileSuffix, messageMedia.fileSuffix);
    }

    public int hashCode() {
        return (((((((((((((this.fileKey.hashCode() * 31) + this.fileHash.hashCode()) * 31) + this.fileType.hashCode()) * 31) + (this.imageHeight == null ? 0 : this.imageHeight.hashCode())) * 31) + (this.imageWidth != null ? this.imageWidth.hashCode() : 0)) * 31) + Long.hashCode(this.fileSize)) * 31) + this.fileKey2.hashCode()) * 31) + this.fileSuffix.hashCode();
    }

    public String toString() {
        return "MessageMedia(fileKey=" + this.fileKey + ", fileHash=" + this.fileHash + ", fileType=" + this.fileType + ", imageHeight=" + this.imageHeight + ", imageWidth=" + this.imageWidth + ", fileSize=" + this.fileSize + ", fileKey2=" + this.fileKey2 + ", fileSuffix=" + this.fileSuffix + ")";
    }

    public MessageMedia(String fileKey, String fileHash, String fileType, Long imageHeight, Long imageWidth, long fileSize, String fileKey2, String fileSuffix) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(fileKey2, "fileKey2");
        Intrinsics.checkNotNullParameter(fileSuffix, "fileSuffix");
        this.fileKey = fileKey;
        this.fileHash = fileHash;
        this.fileType = fileType;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.fileSize = fileSize;
        this.fileKey2 = fileKey2;
        this.fileSuffix = fileSuffix;
    }

    public /* synthetic */ MessageMedia(String str, String str2, String str3, Long l, Long l2, long j, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, j, str4, str5);
    }

    public final String getFileKey() {
        return this.fileKey;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final Long getImageHeight() {
        return this.imageHeight;
    }

    public final Long getImageWidth() {
        return this.imageWidth;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getFileKey2() {
        return this.fileKey2;
    }

    public final String getFileSuffix() {
        return this.fileSuffix;
    }
}
