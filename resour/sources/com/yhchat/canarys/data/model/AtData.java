package com.yhchat.canarys.data.model;

import androidx.core.os.EnvironmentCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Conversation.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006&"}, m169d2 = {"Lcom/yhchat/canarys/data/model/AtData;", "", EnvironmentCompat.MEDIA_UNKNOWN, "", "mentionedId", "", "mentionedName", "mentionedIn", "mentionerId", "mentionerName", "msgSeq", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getUnknown", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMentionedId", "()Ljava/lang/String;", "getMentionedName", "getMentionedIn", "getMentionerId", "getMentionerName", "getMsgSeq", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/yhchat/canarys/data/model/AtData;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AtData {
    public static final int $stable = 0;

    @SerializedName("mentioned_id")
    private final String mentionedId;

    @SerializedName("mentioned_in")
    private final String mentionedIn;

    @SerializedName("mentioned_name")
    private final String mentionedName;

    @SerializedName("mentioner_id")
    private final String mentionerId;

    @SerializedName("mentioner_name")
    private final String mentionerName;

    @SerializedName("msg_seq")
    private final Long msgSeq;

    @SerializedName(EnvironmentCompat.MEDIA_UNKNOWN)
    private final Long unknown;

    public AtData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AtData copy$default(AtData atData, Long l, String str, String str2, String str3, String str4, String str5, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = atData.unknown;
        }
        if ((i & 2) != 0) {
            str = atData.mentionedId;
        }
        if ((i & 4) != 0) {
            str2 = atData.mentionedName;
        }
        if ((i & 8) != 0) {
            str3 = atData.mentionedIn;
        }
        if ((i & 16) != 0) {
            str4 = atData.mentionerId;
        }
        if ((i & 32) != 0) {
            str5 = atData.mentionerName;
        }
        if ((i & 64) != 0) {
            l2 = atData.msgSeq;
        }
        String str6 = str5;
        Long l3 = l2;
        String str7 = str4;
        String str8 = str2;
        return atData.copy(l, str, str8, str3, str7, str6, l3);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getUnknown() {
        return this.unknown;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMentionedId() {
        return this.mentionedId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMentionedName() {
        return this.mentionedName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMentionedIn() {
        return this.mentionedIn;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMentionerId() {
        return this.mentionerId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMentionerName() {
        return this.mentionerName;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getMsgSeq() {
        return this.msgSeq;
    }

    public final AtData copy(Long unknown, String mentionedId, String mentionedName, String mentionedIn, String mentionerId, String mentionerName, Long msgSeq) {
        return new AtData(unknown, mentionedId, mentionedName, mentionedIn, mentionerId, mentionerName, msgSeq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtData)) {
            return false;
        }
        AtData atData = (AtData) other;
        return Intrinsics.areEqual(this.unknown, atData.unknown) && Intrinsics.areEqual(this.mentionedId, atData.mentionedId) && Intrinsics.areEqual(this.mentionedName, atData.mentionedName) && Intrinsics.areEqual(this.mentionedIn, atData.mentionedIn) && Intrinsics.areEqual(this.mentionerId, atData.mentionerId) && Intrinsics.areEqual(this.mentionerName, atData.mentionerName) && Intrinsics.areEqual(this.msgSeq, atData.msgSeq);
    }

    public int hashCode() {
        return ((((((((((((this.unknown == null ? 0 : this.unknown.hashCode()) * 31) + (this.mentionedId == null ? 0 : this.mentionedId.hashCode())) * 31) + (this.mentionedName == null ? 0 : this.mentionedName.hashCode())) * 31) + (this.mentionedIn == null ? 0 : this.mentionedIn.hashCode())) * 31) + (this.mentionerId == null ? 0 : this.mentionerId.hashCode())) * 31) + (this.mentionerName == null ? 0 : this.mentionerName.hashCode())) * 31) + (this.msgSeq != null ? this.msgSeq.hashCode() : 0);
    }

    public String toString() {
        return "AtData(unknown=" + this.unknown + ", mentionedId=" + this.mentionedId + ", mentionedName=" + this.mentionedName + ", mentionedIn=" + this.mentionedIn + ", mentionerId=" + this.mentionerId + ", mentionerName=" + this.mentionerName + ", msgSeq=" + this.msgSeq + ")";
    }

    public AtData(Long unknown, String mentionedId, String mentionedName, String mentionedIn, String mentionerId, String mentionerName, Long msgSeq) {
        this.unknown = unknown;
        this.mentionedId = mentionedId;
        this.mentionedName = mentionedName;
        this.mentionedIn = mentionedIn;
        this.mentionerId = mentionerId;
        this.mentionerName = mentionerName;
        this.msgSeq = msgSeq;
    }

    public /* synthetic */ AtData(Long l, String str, String str2, String str3, String str4, String str5, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : l2);
    }

    public final Long getUnknown() {
        return this.unknown;
    }

    public final String getMentionedId() {
        return this.mentionedId;
    }

    public final String getMentionedName() {
        return this.mentionedName;
    }

    public final String getMentionedIn() {
        return this.mentionedIn;
    }

    public final String getMentionerId() {
        return this.mentionerId;
    }

    public final String getMentionerName() {
        return this.mentionerName;
    }

    public final Long getMsgSeq() {
        return this.msgSeq;
    }
}
