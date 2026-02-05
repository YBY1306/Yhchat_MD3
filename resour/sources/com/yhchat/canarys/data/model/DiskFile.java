package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Disk.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0005J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\bH\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012\u00a8\u0006+"}, m169d2 = {"Lcom/yhchat/canarys/data/model/DiskFile;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "fileSize", "objectType", "", "uploadTime", "uploadBy", "uploadByName", "qiniuKey", "<init>", "(JLjava/lang/String;JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getFileSize", "getObjectType", "()I", "getUploadTime", "getUploadBy", "getUploadByName", "getQiniuKey", "isFolder", "", "getFileUrl", "getFormattedSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DiskFile {
    public static final int $stable = 0;

    @SerializedName("fileSize")
    private final long fileSize;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("objectType")
    private final int objectType;

    @SerializedName("qiniuKey")
    private final String qiniuKey;

    @SerializedName("uploadBy")
    private final String uploadBy;

    @SerializedName("uploadByName")
    private final String uploadByName;

    @SerializedName("uploadTime")
    private final long uploadTime;

    public static /* synthetic */ DiskFile copy$default(DiskFile diskFile, long j, String str, long j2, int i, long j3, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = diskFile.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            str = diskFile.name;
        }
        return diskFile.copy(j4, str, (i2 & 4) != 0 ? diskFile.fileSize : j2, (i2 & 8) != 0 ? diskFile.objectType : i, (i2 & 16) != 0 ? diskFile.uploadTime : j3, (i2 & 32) != 0 ? diskFile.uploadBy : str2, (i2 & 64) != 0 ? diskFile.uploadByName : str3, (i2 & 128) != 0 ? diskFile.qiniuKey : str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component4, reason: from getter */
    public final int getObjectType() {
        return this.objectType;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUploadBy() {
        return this.uploadBy;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUploadByName() {
        return this.uploadByName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getQiniuKey() {
        return this.qiniuKey;
    }

    public final DiskFile copy(long id, String name, long fileSize, int objectType, long uploadTime, String uploadBy, String uploadByName, String qiniuKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uploadBy, "uploadBy");
        Intrinsics.checkNotNullParameter(uploadByName, "uploadByName");
        Intrinsics.checkNotNullParameter(qiniuKey, "qiniuKey");
        return new DiskFile(id, name, fileSize, objectType, uploadTime, uploadBy, uploadByName, qiniuKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiskFile)) {
            return false;
        }
        DiskFile diskFile = (DiskFile) other;
        return this.id == diskFile.id && Intrinsics.areEqual(this.name, diskFile.name) && this.fileSize == diskFile.fileSize && this.objectType == diskFile.objectType && this.uploadTime == diskFile.uploadTime && Intrinsics.areEqual(this.uploadBy, diskFile.uploadBy) && Intrinsics.areEqual(this.uploadByName, diskFile.uploadByName) && Intrinsics.areEqual(this.qiniuKey, diskFile.qiniuKey);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + Integer.hashCode(this.objectType)) * 31) + Long.hashCode(this.uploadTime)) * 31) + this.uploadBy.hashCode()) * 31) + this.uploadByName.hashCode()) * 31) + this.qiniuKey.hashCode();
    }

    public String toString() {
        return "DiskFile(id=" + this.id + ", name=" + this.name + ", fileSize=" + this.fileSize + ", objectType=" + this.objectType + ", uploadTime=" + this.uploadTime + ", uploadBy=" + this.uploadBy + ", uploadByName=" + this.uploadByName + ", qiniuKey=" + this.qiniuKey + ")";
    }

    public DiskFile(long id, String name, long fileSize, int objectType, long uploadTime, String uploadBy, String uploadByName, String qiniuKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uploadBy, "uploadBy");
        Intrinsics.checkNotNullParameter(uploadByName, "uploadByName");
        Intrinsics.checkNotNullParameter(qiniuKey, "qiniuKey");
        this.id = id;
        this.name = name;
        this.fileSize = fileSize;
        this.objectType = objectType;
        this.uploadTime = uploadTime;
        this.uploadBy = uploadBy;
        this.uploadByName = uploadByName;
        this.qiniuKey = qiniuKey;
    }

    public /* synthetic */ DiskFile(long j, String str, long j2, int i, long j3, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i2 & 4) != 0 ? 0L : j2, i, (i2 & 16) != 0 ? 0L : j3, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? "" : str4);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getObjectType() {
        return this.objectType;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    public final String getUploadBy() {
        return this.uploadBy;
    }

    public final String getUploadByName() {
        return this.uploadByName;
    }

    public final String getQiniuKey() {
        return this.qiniuKey;
    }

    public final boolean isFolder() {
        return this.objectType == 1;
    }

    public final String getFileUrl() {
        if (this.qiniuKey.length() > 0) {
            return "https://chat-img.jwznb.com/" + this.qiniuKey;
        }
        return "";
    }

    public final String getFormattedSize() {
        if (isFolder()) {
            return "-";
        }
        double kb = this.fileSize / 1024.0d;
        double mb = kb / 1024.0d;
        double gb = mb / 1024.0d;
        if (gb >= 1.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(gb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (mb >= 1.0d) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(mb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (kb >= 1.0d) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(kb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        return this.fileSize + " B";
    }
}
