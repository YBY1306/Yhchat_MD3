package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserDetailModels.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RemarkInfo;", "", "remarkName", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "extraRemark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRemarkName", "()Ljava/lang/String;", "getPhoneNumber", "getExtraRemark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RemarkInfo {
    public static final int $stable = 0;
    private final String extraRemark;
    private final String phoneNumber;
    private final String remarkName;

    public static /* synthetic */ RemarkInfo copy$default(RemarkInfo remarkInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remarkInfo.remarkName;
        }
        if ((i & 2) != 0) {
            str2 = remarkInfo.phoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = remarkInfo.extraRemark;
        }
        return remarkInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExtraRemark() {
        return this.extraRemark;
    }

    public final RemarkInfo copy(String remarkName, String phoneNumber, String extraRemark) {
        Intrinsics.checkNotNullParameter(remarkName, "remarkName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(extraRemark, "extraRemark");
        return new RemarkInfo(remarkName, phoneNumber, extraRemark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemarkInfo)) {
            return false;
        }
        RemarkInfo remarkInfo = (RemarkInfo) other;
        return Intrinsics.areEqual(this.remarkName, remarkInfo.remarkName) && Intrinsics.areEqual(this.phoneNumber, remarkInfo.phoneNumber) && Intrinsics.areEqual(this.extraRemark, remarkInfo.extraRemark);
    }

    public int hashCode() {
        return (((this.remarkName.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.extraRemark.hashCode();
    }

    public String toString() {
        return "RemarkInfo(remarkName=" + this.remarkName + ", phoneNumber=" + this.phoneNumber + ", extraRemark=" + this.extraRemark + ")";
    }

    public RemarkInfo(String remarkName, String phoneNumber, String extraRemark) {
        Intrinsics.checkNotNullParameter(remarkName, "remarkName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(extraRemark, "extraRemark");
        this.remarkName = remarkName;
        this.phoneNumber = phoneNumber;
        this.extraRemark = extraRemark;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getExtraRemark() {
        return this.extraRemark;
    }
}
