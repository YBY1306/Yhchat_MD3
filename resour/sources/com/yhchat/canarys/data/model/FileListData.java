package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Disk.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/data/model/FileListData;", "", "list", "", "Lcom/yhchat/canarys/data/model/DiskFile;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FileListData {
    public static final int $stable = 8;

    @SerializedName("list")
    private final List<DiskFile> list;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileListData copy$default(FileListData fileListData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fileListData.list;
        }
        return fileListData.copy(list);
    }

    public final List<DiskFile> component1() {
        return this.list;
    }

    public final FileListData copy(List<DiskFile> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new FileListData(list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FileListData) && Intrinsics.areEqual(this.list, ((FileListData) other).list);
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return "FileListData(list=" + this.list + ")";
    }

    public FileListData(List<DiskFile> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    public final List<DiskFile> getList() {
        return this.list;
    }
}
