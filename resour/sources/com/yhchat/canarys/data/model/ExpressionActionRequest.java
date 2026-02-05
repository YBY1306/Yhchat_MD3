package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Expression.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ExpressionActionRequest;", "", Name.MARK, "", "url", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/ExpressionActionRequest;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExpressionActionRequest {
    public static final int $stable = 0;

    @SerializedName(Name.MARK)
    private final Long id;

    @SerializedName("url")
    private final String url;

    public ExpressionActionRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExpressionActionRequest copy$default(ExpressionActionRequest expressionActionRequest, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = expressionActionRequest.id;
        }
        if ((i & 2) != 0) {
            str = expressionActionRequest.url;
        }
        return expressionActionRequest.copy(l, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final ExpressionActionRequest copy(Long id, String url) {
        return new ExpressionActionRequest(id, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressionActionRequest)) {
            return false;
        }
        ExpressionActionRequest expressionActionRequest = (ExpressionActionRequest) other;
        return Intrinsics.areEqual(this.id, expressionActionRequest.id) && Intrinsics.areEqual(this.url, expressionActionRequest.url);
    }

    public int hashCode() {
        return ((this.id == null ? 0 : this.id.hashCode()) * 31) + (this.url != null ? this.url.hashCode() : 0);
    }

    public String toString() {
        return "ExpressionActionRequest(id=" + this.id + ", url=" + this.url + ")";
    }

    public ExpressionActionRequest(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    public /* synthetic */ ExpressionActionRequest(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }

    public final Long getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }
}
