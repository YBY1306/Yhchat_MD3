package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Disk.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RenameFileRequest;", "", Name.MARK, "", "objectType", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(JILjava/lang/String;)V", "getId", "()J", "getObjectType", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RenameFileRequest {
    public static final int $stable = 0;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("objectType")
    private final int objectType;

    public static /* synthetic */ RenameFileRequest copy$default(RenameFileRequest renameFileRequest, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = renameFileRequest.id;
        }
        if ((i2 & 2) != 0) {
            i = renameFileRequest.objectType;
        }
        if ((i2 & 4) != 0) {
            str = renameFileRequest.name;
        }
        return renameFileRequest.copy(j, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getObjectType() {
        return this.objectType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final RenameFileRequest copy(long id, int objectType, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new RenameFileRequest(id, objectType, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenameFileRequest)) {
            return false;
        }
        RenameFileRequest renameFileRequest = (RenameFileRequest) other;
        return this.id == renameFileRequest.id && this.objectType == renameFileRequest.objectType && Intrinsics.areEqual(this.name, renameFileRequest.name);
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + Integer.hashCode(this.objectType)) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "RenameFileRequest(id=" + this.id + ", objectType=" + this.objectType + ", name=" + this.name + ")";
    }

    public RenameFileRequest(long id, int objectType, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.objectType = objectType;
        this.name = name;
    }

    public final long getId() {
        return this.id;
    }

    public final int getObjectType() {
        return this.objectType;
    }

    public final String getName() {
        return this.name;
    }
}
