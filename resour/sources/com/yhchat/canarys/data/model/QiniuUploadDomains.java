package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/data/model/QiniuUploadDomains;", "", "domains", "", "", "<init>", "(Ljava/util/List;)V", "getDomains", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class QiniuUploadDomains {
    public static final int $stable = 8;

    @SerializedName("domains")
    private final List<String> domains;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QiniuUploadDomains copy$default(QiniuUploadDomains qiniuUploadDomains, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qiniuUploadDomains.domains;
        }
        return qiniuUploadDomains.copy(list);
    }

    public final List<String> component1() {
        return this.domains;
    }

    public final QiniuUploadDomains copy(List<String> domains) {
        Intrinsics.checkNotNullParameter(domains, "domains");
        return new QiniuUploadDomains(domains);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QiniuUploadDomains) && Intrinsics.areEqual(this.domains, ((QiniuUploadDomains) other).domains);
    }

    public int hashCode() {
        return this.domains.hashCode();
    }

    public String toString() {
        return "QiniuUploadDomains(domains=" + this.domains + ")";
    }

    public QiniuUploadDomains(List<String> domains) {
        Intrinsics.checkNotNullParameter(domains, "domains");
        this.domains = domains;
    }

    public final List<String> getDomains() {
        return this.domains;
    }
}
