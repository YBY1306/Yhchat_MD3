package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/api/ReportPostRequest;", "", "typ", "", Name.MARK, "content", "", "url", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getTyp", "()I", "getId", "getContent", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ReportPostRequest {
    public static final int $stable = 0;

    @SerializedName("content")
    private final String content;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("typ")
    private final int typ;

    @SerializedName("url")
    private final String url;

    public static /* synthetic */ ReportPostRequest copy$default(ReportPostRequest reportPostRequest, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = reportPostRequest.typ;
        }
        if ((i3 & 2) != 0) {
            i2 = reportPostRequest.id;
        }
        if ((i3 & 4) != 0) {
            str = reportPostRequest.content;
        }
        if ((i3 & 8) != 0) {
            str2 = reportPostRequest.url;
        }
        return reportPostRequest.copy(i, i2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTyp() {
        return this.typ;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final ReportPostRequest copy(int typ, int id, String content, String url) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new ReportPostRequest(typ, id, content, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportPostRequest)) {
            return false;
        }
        ReportPostRequest reportPostRequest = (ReportPostRequest) other;
        return this.typ == reportPostRequest.typ && this.id == reportPostRequest.id && Intrinsics.areEqual(this.content, reportPostRequest.content) && Intrinsics.areEqual(this.url, reportPostRequest.url);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.typ) * 31) + Integer.hashCode(this.id)) * 31) + this.content.hashCode()) * 31) + (this.url == null ? 0 : this.url.hashCode());
    }

    public String toString() {
        return "ReportPostRequest(typ=" + this.typ + ", id=" + this.id + ", content=" + this.content + ", url=" + this.url + ")";
    }

    public ReportPostRequest(int typ, int id, String content, String url) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.typ = typ;
        this.id = id;
        this.content = content;
        this.url = url;
    }

    public /* synthetic */ ReportPostRequest(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, i2, str, (i3 & 8) != 0 ? null : str2);
    }

    public final int getTyp() {
        return this.typ;
    }

    public final int getId() {
        return this.id;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getUrl() {
        return this.url;
    }
}
